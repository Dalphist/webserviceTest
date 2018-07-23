package util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * This file was extracted from Ganymede 1.0.11 (http://tools.arlut.utexas.edu/gash2/).
 */

/**
 * <p>
 * This class defines a method, {@link md5Encrypt(java.lang.String, java.lang.String) crypt()}, which takes a
 * password and a salt string and generates an OpenBSD/FreeBSD/Linux-compatible md5-encoded password entry.
 * </p>
 * 
 * <p>
 * Created: 3 November 1999
 * </p>
 * <p>
 * Release: $Name: $
 * </p>
 * <p>
 * Version: $Revision: 1.1 $
 * </p>
 * <p>
 * Last Mod Date: $Date: 2004/07/12 13:35:20 $
 * </p>
 * <p>
 * Java Code By: Jonathan Abbey, jonabbey@arlut.utexas.edu
 * </p>
 * <p>
 * Original C Version:
 * 
 * <pre>
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <phk@login.dknet.dk> wrote this file.  As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return.   Poul-Henning Kamp
 * ----------------------------------------------------------------------------
 * </pre>
 * 
 * </p>
 * 
 * @author Jonathan Abbey <jonabbey at arlut.utexas.edu>
 */

/*
 * 修改 by xlj 主要用途 * 四种加密方式 apacheCrypt apache所用MD5加密 输出密码样式：$apr1$faednitf$fO1U/QheIAn3UI9hA7wHP/ linuxCrypt
 * linux兼容MD5加密 输出密码样式：$1$faednitf$s9ex/9xewqO9/Mw1fUX9o1 shaCrypt SHA1加密 输出密码样式：{SHA}VBPuJHI7uixaa6LQGWx4s+5GKNE=
 * md5Crypt 标准MD5加密 输出密码样式：c4ca4238a0b923820dcc509a6f75849b crypt 根据默认值采取以上某种加密方式 * 密码验证 passwordValidate
 * 根据输入的密码和已加密的密码验证是否匹配 可以验证以上四种加密的任一种及未加密文本（plain-text）的方式。 其中区分是由普通md5加密还是密码未加密 是根据加密密码长度是否是32位。
 */

public final class MD5Crypt {

	/**
	 * 
	 * Command line test rig.
	 * 
	 * @throws NoSuchAlgorithmException
	 * 
	 */
	static public void main(String argv[]) throws NoSuchAlgorithmException {
	}

	static private final String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	static private final String itoa64 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	static private final int APACHE_MODE = 0;
	static private final int LINUX_MODE = 1;
	static private final int MD5_MODE = 2;
	static private final int SHA_MODE = 3;
	static private final int DES_MODE = 4;
	static private final int PLAIN_MODE = 5;

	static private int defaultMode = APACHE_MODE;

	/*
	 * 根据默认值 采取某种加密方式
	 */
	static public final String encrypt(String password) throws Exception {
		if (defaultMode == APACHE_MODE) {
			return apacheEncrypt(password);
		} else if (defaultMode == LINUX_MODE) {
			return linuxEncrypt(password);
		} else if (defaultMode == MD5_MODE) {
			return md5Encrypt(password);
		} else if (defaultMode == SHA_MODE) {
			return shaEncrypt(password);
		} else if (defaultMode == DES_MODE) {
			return desEncrypt(password);
		} else if (defaultMode == PLAIN_MODE) {
			return password;
		} else {
			return password;
		}
	}

	static private final String to64(long v, int size) {
		StringBuffer result = new StringBuffer();

		while (--size >= 0) {
			result.append(itoa64.charAt((int) (v & 0x3f)));
			v >>>= 6;
		}

		return result.toString();
	}

	static private final void clearbits(byte bits[]) {
		for (int i = 0; i < bits.length; i++) {
			bits[i] = 0;
		}
	}

	/**
	 * convert an encoded unsigned byte value into a int with the unsigned value.
	 */

	static private final int bytes2u(byte inp) {
		return inp & 0xff;
	}

	/**
	 * <p>
	 * This method actually generates a normal md5-encoded password hash from a plaintext password.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form 'hashed mess'
	 * </p>
	 * 
	 * @param password Plaintext password
	 * 
	 * @return An normal 32bit md5-hashed password field.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String md5Encrypt(String password) throws NoSuchAlgorithmException {
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		return encodeHex(algorithm.digest(password.getBytes()));
	}

	static private final String encodeHex(byte[] bytes) {

		StringBuffer buf = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			if ((bytes[i] & 0xff) < 0x10) {
				buf.append("0");
			}
			buf.append(Long.toString(bytes[i] & 0xff, 16));
		}
		return buf.toString();
	}

	/**
	 * <p>
	 * This method actually generates a sha-encoded password hash from a plaintext password.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '{SHA}hashed mess'
	 * </p>
	 * 
	 * @param password Plaintext password
	 * 
	 * @return An normal 32bit md5-hashed password field.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String shaEncrypt(String password) throws NoSuchAlgorithmException {
		MessageDigest algorithm = MessageDigest.getInstance("SHA1");
		return "{SHA}" + new sun.misc.BASE64Encoder().encode(algorithm.digest(password.getBytes()));
	}

	/**
	 * <p>
	 * This method actually generates a OpenBSD/FreeBSD/Linux PAM compatible md5-encoded password hash from a plaintext
	 * password and a salt.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '$1$&lt;salt&gt;$&lt;hashed mess&gt;
	 * </p>
	 * 
	 * @param password Plaintext password
	 * 
	 * @return An OpenBSD/FreeBSD/Linux-compatible md5-hashed password field.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String linuxEncrypt(String password) throws NoSuchAlgorithmException {
		StringBuffer salt = new StringBuffer();
		java.util.Random randgen = new java.util.Random();

		/* -- */

		while (salt.length() < 8) {
			int index = (int) (randgen.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.substring(index, index + 1));
		}

		return MD5Crypt.linuxEncrypt(password, salt.toString());
	}

	/**
	 * <p>
	 * This method actually generates a OpenBSD/FreeBSD/Linux PAM compatible md5-encoded password hash from a plaintext
	 * password and a salt.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '$1$&lt;salt&gt;$&lt;hashed mess&gt;
	 * </p>
	 * 
	 * @param password Plaintext password
	 * @param salt A short string to use to randomize md5. May start with $1$, which will be ignored. It is explicitly
	 *        permitted to pass a pre-existing MD5Crypt'ed password entry as the salt. crypt() will strip the salt chars
	 *        out properly.
	 * 
	 * @return An OpenBSD/FreeBSD/Linux-compatible md5-hashed password field.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String linuxEncrypt(String password, String salt) throws NoSuchAlgorithmException {
		return MD5Crypt.md5Encode(password, salt, "$1$");
	}

	/**
	 * <p>
	 * This method generates an Apache MD5 compatible md5-encoded password hash from a plaintext password and a salt.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '$apr1$&lt;salt&gt;$&lt;hashed mess&gt;
	 * </p>
	 * 
	 * @param password Plaintext password
	 * 
	 * @return An Apache-compatible md5-hashed password string.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String apacheEncrypt(String password) throws NoSuchAlgorithmException {
		StringBuffer salt = new StringBuffer();
		java.util.Random randgen = new java.util.Random();

		/* -- */

		while (salt.length() < 8) {
			int index = (int) (randgen.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.substring(index, index + 1));
		}

		return MD5Crypt.apacheEncrypt(password, salt.toString());
	}

	/**
	 * <p>
	 * This method actually generates an Apache MD5 compatible md5-encoded password hash from a plaintext password and a
	 * salt.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '$apr1$&lt;salt&gt;$&lt;hashed mess&gt;
	 * </p>
	 * 
	 * @param password Plaintext password
	 * @param salt A short string to use to randomize md5. May start with $apr1$, which will be ignored. It is
	 *        explicitly permitted to pass a pre-existing MD5Crypt'ed password entry as the salt. crypt() will strip the
	 *        salt chars out properly.
	 * 
	 * @return An Apache-compatible md5-hashed password string.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String apacheEncrypt(String password, String salt) throws NoSuchAlgorithmException {
		return MD5Crypt.md5Encode(password, salt, "$apr1$");
	}

	/**
	 * <p>
	 * This method actually generates md5-encoded password hash from a plaintext password, a salt, and a magic string.
	 * </p>
	 * 
	 * <p>
	 * There are two magic strings that make sense to use here.. '$1$' is the magic string used by the
	 * FreeBSD/Linux/OpenBSD MD5Crypt algorithm, and '$apr1$' is the magic string used by the Apache MD5Crypt algorithm.
	 * </p>
	 * 
	 * <p>
	 * The resulting string will be in the form '&lt;magic&gt;&lt;salt&gt;$&lt;hashed mess&gt;
	 * </p>
	 * 
	 * @param password Plaintext password @param salt A short string to use to randomize md5. May start with the magic
	 *        string, which will be ignored. It is explicitly permitted to pass a pre-existing MD5Crypt'ed password
	 *        entry as the salt. crypt() will strip the salt chars out properly.
	 * 
	 * @return An md5-hashed password string.
	 * @throws NoSuchAlgorithmException
	 */

	static private final String md5Encode(String password, String salt, String magic) throws NoSuchAlgorithmException {
		/*
		 * This string is magic for this algorithm. Having it this way, we can get get better later on
		 */

		byte finalState[];
		MessageDigest ctx, ctx1;
		long l;

		/* -- */

		/* Refine the Salt first */

		/* If it starts with the magic string, then skip that */

		if (salt.startsWith(magic)) {
			salt = salt.substring(magic.length());
		}

		/* It stops at the first '$', max 8 chars */

		if (salt.indexOf('$') != -1) {
			salt = salt.substring(0, salt.indexOf('$'));
		}

		if (salt.length() > 8) {
			salt = salt.substring(0, 8);
		}

		ctx = MessageDigest.getInstance("MD5");

		ctx.update(password.getBytes()); // The password first, since that is what is most unknown
		ctx.update(magic.getBytes()); // Then our magic string
		ctx.update(salt.getBytes()); // Then the raw salt

		/* Then just as many characters of the MD5(pw,salt,pw) */

		ctx1 = MessageDigest.getInstance("MD5");
		ctx1.update(password.getBytes());
		ctx1.update(salt.getBytes());
		ctx1.update(password.getBytes());

		finalState = ctx1.digest();

		for (int pl = password.length(); pl > 0; pl -= 16) {
			ctx.update(finalState, 0, pl > 16 ? 16 : pl);
		}

		/*
		 * the original code claimed that finalState was being cleared to keep dangerous bits out of memory, but doing
		 * this is also required in order to get the right output.
		 */

		clearbits(finalState);

		/* Then something really weird... */

		for (int i = password.length(); i != 0; i >>>= 1) {
			if ((i & 1) != 0) {
				ctx.update(finalState, 0, 1);
			} else {
				ctx.update(password.getBytes(), 0, 1);
			}
		}

		finalState = ctx.digest();

		/*
		 * and now, just to make sure things don't run too fast On a 60 Mhz Pentium this takes 34 msec, so you would
		 * need 30 seconds to build a 1000 entry dictionary...
		 * 
		 * (The above timings from the C version)
		 */

		for (int i = 0; i < 1000; i++) {
			ctx1.reset();
			if ((i & 1) != 0) {
				ctx1.update(password.getBytes());
			} else {
				ctx1.update(finalState, 0, 16);
			}

			if ((i % 3) != 0) {
				ctx1.update(salt.getBytes());
			}

			if ((i % 7) != 0) {
				ctx1.update(password.getBytes());
			}

			if ((i & 1) != 0) {
				ctx1.update(finalState, 0, 16);
			} else {
				ctx1.update(password.getBytes());
			}

			finalState = ctx1.digest();
		}

		/* Now make the output string */

		StringBuffer result = new StringBuffer();

		result.append(magic);
		result.append(salt);
		result.append("$");

		l = (bytes2u(finalState[0]) << 16) | (bytes2u(finalState[6]) << 8) | bytes2u(finalState[12]);
		result.append(to64(l, 4));

		l = (bytes2u(finalState[1]) << 16) | (bytes2u(finalState[7]) << 8) | bytes2u(finalState[13]);
		result.append(to64(l, 4));

		l = (bytes2u(finalState[2]) << 16) | (bytes2u(finalState[8]) << 8) | bytes2u(finalState[14]);
		result.append(to64(l, 4));

		l = (bytes2u(finalState[3]) << 16) | (bytes2u(finalState[9]) << 8) | bytes2u(finalState[15]);
		result.append(to64(l, 4));

		l = (bytes2u(finalState[4]) << 16) | (bytes2u(finalState[10]) << 8) | bytes2u(finalState[5]);
		result.append(to64(l, 4));

		l = bytes2u(finalState[11]);
		result.append(to64(l, 2));

		/* Don't leave anything around in vm they could use. */
		clearbits(finalState);

		return result.toString();
	}

	//DES加密
	static public final String desEncrypt(String password) {
		try {
			String key = "|KingRein|";
			BASE64Encoder encoder = new BASE64Encoder();

			DESKeySpec dks = new DESKeySpec(key.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey serureKey = keyFactory.generateSecret(dks);

			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, serureKey);
			password = encoder.encode(cipher.doFinal(password.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}

	//DES解密
	static public final String desDecrypt(String password) {
		try {
			String key = "|KingRein|";
			BASE64Decoder decoder = new BASE64Decoder();
			DESKeySpec dks = new DESKeySpec(key.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey serureKey = keyFactory.generateSecret(dks);

			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, serureKey);
			password = new String(cipher.doFinal(decoder.decodeBuffer(password)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}

	/*
	 * 密码验证 passwordValidate 根据输入的密码和已加密的密码验证是否匹配 可以验证以上四种加密的任一种及未加密文本（plain-text）的方式。 其中区分是由普通md5加密还是密码未加密
	 * 是根据加密密码长度是否是32位。
	 */
	static public final boolean passwordValidate(String passwd, String hash) throws NoSuchAlgorithmException {
		if (hash.startsWith("$apr1$")) {
			//采用apache的md5加密
			String[] hashArray = hash.split("\\$");
			if (hashArray[2] != null) {
				if (hash.equals(md5Encode(passwd, hashArray[2], "$apr1$"))) {
					return true;
				}
			}
		} else if (hash.startsWith("$1$")) {
			//采用linux兼容md5加密
			String[] hashArray = hash.split("\\$");
			if (hashArray[2] != null) {
				if (hash.equals(md5Encode(passwd, hashArray[2], "$1$"))) {
					return true;
				}
			}
		} else if (hash.startsWith("{SHA}")) {
			//采用sha1加密
			if (hash.equals(shaEncrypt(passwd))) {
				return true;
			}
		} else if (hash.length() == 32) {
			//采用普通md5加密
			if (hash.equals(md5Encrypt(passwd))) {
				return true;
			}
		} else {
			//未加密
			if (hash.equals(passwd)) {
				return true;
			}
		}
		return false;
	}
}