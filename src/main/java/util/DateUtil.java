package util;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Date工具类
 * 
 * @author ZhangZhiGao
 *         <p>
 *         Company: 北京统御至诚科技有限公司
 *         </p>
 */
public class DateUtil {
	
	public static void main(String[] args) {
		String s = DateUtil.getLocalDate("yyMMdd");
		System.out.println(s);
	}

	/**
	 * 此类中封装一些常用的字符串操作。 所有方法都是静态方法，不需要生成此类的实例， 为避免生成此类的实例，构造方法被申明为private类型的。
	 */
	private DateUtil() {
	}

	/**
	 * 获取当前系统时间，格式'yyyy-mm-dd'
	 * 
	 * @return 当前系统时间
	 */
	public static String getLocalDate() {
		return format(getDate());
	}

	/**
	 * 获取指定格式的系统时间字符串
	 * 
	 * @param dateFormat 日期格式
	 * @return 指定格式的系统时间
	 */
	public static String getLocalDate(String dateFormat) {
		return format(getDate(), dateFormat);
	}

	/**
	 * 获取当前系统日期、时间
	 * 
	 * @return 当前系统日期、时间
	 */
	public static Date getDate() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * 返回当前系统日期、时间
	 * 
	 * @param format 返回日期的格式
	 * @return 系统日期、时间
	 */
	public static Date getDate(String format) {
		return parse(getLocalDate(format));
	}

	/**
	 * 获取格式化后的日期
	 * @param date
	 * @param fromat
	 * @return
	 */
	public static Date getDate(Date date ,String fromat){return parse(format(date, fromat));}

	/**
	 * 格式化日期 'yyyy-mm-dd'
	 * 
	 * @param date 日期
	 * @return 日期字符串格式 'yyyy-mm-dd'
	 */
	public static String format(Date date) {
		return format(date, "yyyy-MM-dd");
	}
	public static String getCurrentDateToHMs() {
		return format(new Date(), "yyyy-MM-dd HH:mm:ss");
	}
	public static String getCurrentDateToHMs(Date date) {
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}
	/**
	 * 格式：dateFormat 指定的格式
	 * 
	 * @param date 日期
	 * @param dateFormat 日期格式
	 * @return 日期字符串格式
	 */
	public static String format(Date date, String dateFormat) {
		return format(date, dateFormat, "");
	}

	public static String format(Date date, String dateFormat, String defaultRtn) {
		if (defaultRtn == null)
			defaultRtn = "";
		if (date == null)
			return defaultRtn;
		Format formatter = new SimpleDateFormat(dateFormat);
		return formatter.format(date);
	}

	/**
	 * 将"yyyy-MM-dd"格式的字符串格式化为Date类型
	 * 
	 * @param str 待转换的字符串
	 * @return 日期
	 */
	public static Date parse(String str) {
		return parse(str, "yyyy-MM-dd");
	}

	/**
	 * 将指定格式的字符串格式化为Date类型
	 * 
	 * @param str 待转换的字符串
	 * @param dateFormat 格式
	 * @return 日期
	 */
	public static Date parse(String str, String dateFormat) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			return format.parse(str);
		} catch (ParseException e) {
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	/**
	 * 根据指定日期字符串进行日期计算后返回格式化的日期-时间字符串
	 * 
	 * @param rq 日期
	 * @param format 录入日期或时间的格式
	 * @param field 日历字段
	 * @param amount 为字段添加的日期或时间量。
	 * @param rtnFormat 返回的日期或时间的格式
	 * @return 格式化的日期-时间字符串。
	 */
	public static String add(String rq, String format, int field, int amount, String rtnFormat) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse(rq, format));
		calendar.add(field, amount);
		return format(calendar.getTime(), rtnFormat);
	}

	/**
	 * 将日期进行计算后返回计算后的格式化的日期
	 * 
	 * @param rq 格式化的日期-时间字符串
	 * @param amount 为字段添加的日期量。
	 * @return 计算后的格式化的日期
	 */
	public static String addDate(String rq, int amount) {
		return add(rq, "yyyy-MM-dd", Calendar.DATE, amount, "yyyy-MM-dd");
	}

	/**
	 * 将月度进行计算后返回计算后的格式化的日期
	 * 
	 * @param rq 格式化的日期-时间字符串
	 * @param amount 为字段添加的日期量。
	 * @return 计算后的格式化的日期
	 */
	public static String addMonth(String rq, int amount) {
		return add(rq, "yyyyMM", Calendar.MONTH, amount, "yyyyMM");
	}

	/**
	 * 将年度进行计算后返回计算后的格式化的日期
	 * 
	 * @param rq 格式化的日期-时间字符串
	 * @param amount 为字段添加的日期量。
	 * @return 计算后的格式化的日期
	 */
	public static String addYear(String rq, int amount) {
		return add(rq, "yyyy", Calendar.YEAR, amount, "yyyy");
	}

	/**
	 * 增加日期
	 * 
	 * @param date 日期
	 * @param field the calendar field
	 * @param i 天数
	 * @return 添加i天后的日期
	 */
	public static Date addDate(Date date, int field, int i) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, i);
		return calendar.getTime();
	}

	/**
	 * 增加日期
	 * 
	 * @param date 日期
	 * @param i 天数
	 * @return 添加i天后的日期
	 */
	public static Date addDate(Date date, int i) {
		return addDate(date, Calendar.DATE, i);
	}

	/**
	 * 增加日期
	 * 
	 * @param date 日期
	 * @param i 月数
	 * @return 添加i月后的日期
	 */
	public static Date addMonth(Date date, int i) {
		return addDate(date, Calendar.MONTH, i);
	}

	/**
	 * 增加日期
	 * 
	 * @param date 日期
	 * @param i 年数
	 * @return 添加i年后的日期
	 */
	public static Date addYear(Date date, int i) {
		return addDate(date, Calendar.YEAR, i);
	}

	/**
	 * 此方法将两个日期之间的时间以dateFormat的格式转换为字符串数组
	 * 
	 * @param dateStart 起始日期
	 * @param dateEnd 终止日期
	 * @param dateFormat 日期格式
	 * @return 日期的字符串数组
	 */
	public static String[] splitDay(String dateStart, String dateEnd, String dateFormat) {
		String[] wordLists;
		Date startDate = parse(dateStart);
		Date endDate = parse(dateEnd);
		if (startDate == null || endDate == null) {
			wordLists = new String[1];
			wordLists[0] = dateStart;
			return wordLists;
		}
		return splitDay(startDate, endDate, dateFormat);
	}

	/**
	 * 此方法将两个日期之间的时间以dateFormat的格式转换为字符串数组
	 * 
	 * @param startRq 起始日期
	 * @param endRq 终止日期
	 * @param dateFormat 日期格式
	 * @return 日期的字符串数组
	 */
	public static String[] splitDay(Date startRq, Date endRq, String dateFormat) {
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startRq);
		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endRq);
		return splitDay(startCalendar, endCalendar, dateFormat);
	}

	/**
	 * 此方法将两个日期之间的时间以dateFormat的格式转换为字符串数组
	 * 
	 * @param grcStart 起始日期
	 * @param grcEnd 终止日期
	 * @param dateFormat 日期格式
	 * @return 日期的字符串数组
	 */
	public static String[] splitDay(Calendar grcStart, Calendar grcEnd, String dateFormat) {
		String[] wordLists;
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		GregorianCalendar grcTmp = new GregorianCalendar();
		grcTmp.setTime(grcStart.getTime());
		int total = differenceOfDay(grcEnd.getTime(), grcStart.getTime()) + 1;
		if (total < 0)
			total = 0;
		wordLists = new String[total];
		for (int i = 0; i < total; i++) {
			wordLists[i] = format.format(grcStart.getTime());
			grcStart.add(Calendar.DATE, 1);
		}
		return wordLists;
	}

	/**
	 * 此方法将两个日期之间的时间以monthFormat的格式转换为字符串数组
	 * 
	 * @param startMonth 起始日期
	 * @param endMonth 终止日期
	 * @param monthFormat 日期格式
	 * @return 日期的字符串数组
	 */
	public static String[] splitMonth(String startMonth, String endMonth, String monthFormat) {
		String[] wordLists;
		SimpleDateFormat format = new SimpleDateFormat(monthFormat);
		GregorianCalendar grcStart = new GregorianCalendar();
		GregorianCalendar grcEnd = new GregorianCalendar();
		if (startMonth == null || endMonth == null) {
			wordLists = new String[1];
			wordLists[0] = startMonth;
			return wordLists;
		}
		try {
			grcStart.setTime(format.parse(startMonth));
			grcEnd.setTime(format.parse(endMonth));
		} catch (ParseException ex) {
			wordLists = new String[1];
			wordLists[0] = startMonth;
			return wordLists;
		}
		return splitMonth(grcStart, grcEnd, monthFormat);
	}

	/**
	 * 此方法将两个日期之间的时间以dateFormat的格式转换为字符串数组
	 * 
	 * @param grcStart 起始日期
	 * @param grcEnd 终止日期
	 * @param dateFormat 日期格式
	 * @return 日期的字符串数组
	 */
	public static String[] splitMonth(Calendar grcStart, Calendar grcEnd, String dateFormat) {
		String[] wordLists;
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		GregorianCalendar grcTmp = new GregorianCalendar();
		grcTmp.setTime(grcStart.getTime());
		int total = 0;
		while (grcTmp.get(Calendar.YEAR) < grcEnd.get(Calendar.YEAR)) {
			total += 12;
			grcTmp.add(Calendar.YEAR, 1);
		}
		if (grcTmp.get(Calendar.YEAR) == grcEnd.get(Calendar.YEAR)) {
			total += grcEnd.get(Calendar.MONTH) - grcTmp.get(Calendar.MONTH);
		}
		if (total <= 0) {
			return null;
		}
		total++;
		wordLists = new String[total];
		for (int i = 0; i < total; i++) {
			wordLists[i] = format.format(grcStart.getTime());
			grcStart.add(Calendar.MONTH, 1);
		}
		return wordLists;
	}

	/**
	 * 计算两个日期之间的日期差值
	 * 
	 * @param date1 日期1
	 * @param date2 日期2
	 * @return 日期1-日期2 的值
	 * @since 1.1
	 */
	public static int differenceOfDay(Date date1, Date date2) {
		long l1 = date1.getTime();
		long l2 = date2.getTime();
		int days = (int) ((l1 - l2) / (24 * 60 * 60 * 1000));
		return days;
	}

	/**
	 * 获取距当前系统时间前24小时的数据，格式'yyyy-mm-dd'
	 * 
	 * @return 昨天系统时间
	 */
	public static String getLastDate() {
		Date date = new Date();
		date = addDate(date, -1);
		return format(date);
	}

	/**
	 * 获取日期的所在月份的最大日期
	 * 
	 * @param date
	 * @return 日期的所在月份的最大日期
	 */
	public static Date getLastDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
		calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
		calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
		return calendar.getTime();
	}

	/**
	 * 获取距当前系统时间前24小时的数据，格式'yyyy-mm-dd'
	 * 
	 * @return 昨天系统时间
	 */
	public static int getLocalHourse() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获取距当前系统时间前24小时的数据，格式'yyyy-mm-dd'
	 * 
	 * @return 昨天系统时间
	 */
	public static int getLocalMinute() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 根据日历的规则，为给定的日历字段添加或减去指定的旬数。
	 * 
	 * @param date 日期
	 * @param amount 与日期所在旬的差值量
	 * @return 根据日历的规则，获取给定的日期所在旬差值为amount的旬度的第一日
	 * @since 1.1
	 */
	public static Date getFirstDayPeriodOfTenDays(Date date, int amount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int xunCount = (calendar.get(Calendar.DAY_OF_MONTH) - 1) / 10;
		if (xunCount == 3)
			xunCount = 2;
		int monthDiff;
		if ((xunCount + amount) < 0) {
			if ((xunCount + amount) / 3 == 0)
				monthDiff = ((xunCount + amount) / 3 - 1);
			else
				monthDiff = (xunCount + amount) / 3;
		} else {
			monthDiff = (xunCount + amount) / 3;
		}
		calendar.setTime(addMonth(calendar.getTime(), monthDiff));
		if ((xunCount + amount) % 3 == 0) {
			xunCount = 0;
		} else if ((xunCount + amount) % 3 < 0) {
			xunCount = (xunCount + amount) % 3 + 3;
		} else {
			xunCount = (xunCount + amount) % 3;
		}
		switch (xunCount) {
		case 0:
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			break;
		case 1:
			calendar.set(Calendar.DAY_OF_MONTH, 11);
			break;
		default:
			calendar.set(Calendar.DAY_OF_MONTH, 21);
		}
		return calendar.getTime();
	}

	/**
	 * 根据日历的规则，为给定的日历字段添加或减去指定的旬数。
	 * 
	 * @param date 日期
	 * @param amount 与日期所在旬的差值量
	 * @return 根据日历的规则，获取给定的日期所在旬差值为amount的旬度的最后一日
	 * @since 1.1
	 */
	public static Date getEndDayPeriodOfTenDays(Date date, int amount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int xunCount = (calendar.get(Calendar.DAY_OF_MONTH) - 1) / 10;
		if (xunCount == 3)
			xunCount = 2;
		int monthDiff;
		if ((xunCount + amount) < 0) {
			if ((xunCount + amount) / 3 == 0)
				monthDiff = ((xunCount + amount) / 3 - 1);
			else
				monthDiff = (xunCount + amount) / 3;
		} else {
			monthDiff = (xunCount + amount) / 3;
		}
		calendar.setTime(addMonth(calendar.getTime(), monthDiff));
		if ((xunCount + amount) % 3 == 0) {
			xunCount = 0;
		} else if ((xunCount + amount) % 3 < 0) {
			xunCount = (xunCount + amount) % 3 + 3;
		} else {
			xunCount = (xunCount + amount) % 3;
		}
		switch (xunCount) {
		case 0:
			calendar.set(Calendar.DAY_OF_MONTH, 10);
			break;
		case 1:
			calendar.set(Calendar.DAY_OF_MONTH, 20);
			break;
		default:
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		}
		return calendar.getTime();
	}

	/**
	 * 根据日期，得到该日期本月第一天为多少
	 * 
	 * @param rq
	 * @return 该月第一天
	 */
	public static String getFirstDayOfMonth(String rq) {
		String strResult = "";
		strResult = rq.substring(0, 7) + "-01";
		return strResult;
	}

	/**
	 * 根据日期，得到该日期本月第一天为多少
	 * 
	 * @param rq
	 * @return 该月第一天
	 */
	public static String getFirstDayOfMonth(Date rq) {
		String strRq = format(rq);
		String strResult = "";
		strResult = strRq.substring(0, 7) + "-01";
		return strResult;
	}

	/**
	 * 根据日期，得到该日期本月第一天为多少
	 * 
	 * @param rq
	 * @return 该月第一天
	 */
	public static Date getFirstDayOfMonthDate(String rq) {
		String strResult = "";
		strResult = rq.substring(0, 7) + "-01";
		return getDate(strResult);
	}

	/**
	 * 根据日期，得到该日期本年第一天为多少
	 * 
	 * @param rq
	 * @return 该年第一天
	 */
	public static String getFirstDayOfYear(Date rq) {
		String strRq = format(rq);
		String strResult = "";
		strResult = strRq.substring(0, 4) + "-01-01";
		return strResult;
	}

	/**
	 * 根据日期，得到该日期年第一天为多少
	 * 
	 * @param rq
	 * @return 该年第一天
	 */
	public static Date getFirstDayOfYearDate(Date rq) {
		String strrq = format(rq);
		String strResult = "";
		strResult = strrq.substring(0, 4) + "-01-01";
		return getDate(strResult);
	}

	/**
	 * 根据日期，得到该日期本月第一天为多少
	 * 
	 * @param rq
	 * @return 该月第一天
	 */
	public static Date getFirstDayOfMonthDate(Date rq) {
		String strResult = "";
		String strRq = format(rq);
		strResult = strRq.substring(0, 7) + "-01";
		return getDate(strResult);
	}

	/**
	 * 合并两个时间，合并后的时间是将date的年、月、日作为年、月、日，将time的时、分、秒作为时、分、秒
	 * 
	 * @param date 2009-10-20 15:47:03
	 * @param time 2009-10-23 17:45:10
	 * @return date time 2009-10-20 17:45:10
	 */
	public static Date getDateTime(Date date, Date time) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(date);
		c2.setTime(time);
		c1.set(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DATE), c2.get(Calendar.HOUR_OF_DAY), c2
			.get(Calendar.MINUTE), c2.get(Calendar.SECOND));
		return c1.getTime();
	}

	/**
	 * 根据给定的月份第几周和周几算出所在的日期
	 * 
	 * @param month 月份
	 * @param week 第几周
	 * @param weekday 一周中的周几
	 * @return 指定月份中第几周、周几的日期
	 */
	public static Date getDayOfWeekMonth(int month, int week, int weekday) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.WEEK_OF_MONTH, week);
		c.set(Calendar.DAY_OF_WEEK, weekday);
		return c.getTime();
	}

	/**
	 * 根据给定的月份、第几周、周几计算出日期的集合
	 * 
	 * @param months 月份的数组
	 * @param weeks 第几周的数组
	 * @param weekDays 周几的数组
	 * @return 日期的集合
	 */
	public static List<Date> getDayOfWeekMonth(int[] months, int[] weeks, int[] weekDays) {
		List<Date> list = new ArrayList<Date>();
		for (int m : months) {
			for (int w : weeks) {
				for (int weekday : weekDays) {
					Date day = getDayOfWeekMonth(m, w, weekday);
					if (day.getMonth() == (m - 1)) {
						list.add(day);
					}
				}
			}
		}
		return list;
	}


	/**
	 * 比较date1和date2相差的多少秒
	 * 
	 * @param date1
	 * @param date2
	 * @return 两个时间相差的秒数
	 */
	public static int differenceOfSecond(Date date1, Date date2) {
		return Math.abs((int) (date1.getTime() - date2.getTime()) / 1000);
	}

	/**
	 * 比较date1和date2相差的多少小时
	 * 
	 * @param date1
	 * @param date2
	 * @return 两个时间相差的小时数
	 */
	public static int differenceOfHour(Date date1, Date date2) {
		return Math.abs((int) (date1.getTime() - date2.getTime()) / 1000 / 60 / 60);
	}

	/**
	 * 将星期转换成汉字 ，比如"1" ——> "一"
	 * 
	 * @param numStr
	 * @return Nov 30, 2009 12:51:09 PM
	 */

	/**
	 * 将星期转换成汉字 ，比如"1" ——> "一"
	 * 
	 * @param numStr[]
	 * @return Nov 30, 2009 12:51:09 PM
	 */
	public static String weekToChinese(String[] numStr) {
		StringBuffer weekBuffer = new StringBuffer();
		for (int i = 0; i < numStr.length; i++) {
			int number = Integer.valueOf(numStr[i]);
			switch (number) {
			case 2:
				weekBuffer.append("一");
				break;
			case 3:
				weekBuffer.append("二");
				break;
			case 4:
				weekBuffer.append("三");
				break;
			case 5:
				weekBuffer.append("四");
				break;
			case 6:
				weekBuffer.append("五");
				break;
			case 7:
				weekBuffer.append("六");
				break;
			case 1:
				weekBuffer.append("日");
				break;
			default:
				break;
			}
			if (i != numStr.length - 1) {
				weekBuffer.append(",");
			}
		}
		return weekBuffer.toString();
	}


	/**
	 * 算出工作日 精确到*天*时
	 * 
	 * @param startD 开始时间
	 * @param endD 结算时间
	 * @return **天**小时
	 */
	public static long[] getWork(Date startD, Date endD) {
		long workTime = endD.getTime() - startD.getTime();
		if (workTime < 0)
			return new long[]{0, 0};
		for (long i = startD.getTime() + 24 * 3600 * 1000; i < startD.getTime(); i += 24 * 3600 * 1000) {
			Date temp = new Date(i);
			if (temp.getDay() == 6 || temp.getDay() == 0)
				workTime -= 24 * 3600 * 1000;
		}
		return new long[]{workTime / (24 * 3600 * 1000), (workTime % (24 * 3600 * 1000)) / (3600 * 1000)};
	}

	/**
	 * 计算两个时间之间工作日的天数
	 * 
	 * @param d1开始日期
	 * @param d2结束日期
	 * @return
	 */
	public static float workDays(Date startDate, Date finishDate) {
		if (startDate.equals(finishDate)) {
			return 0;
		}
		Date d = startDate.before(finishDate) ? startDate : finishDate;
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int count = 0;
		while (!d.after(finishDate)) {
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if (day < 7 && day > 1) {
				count++;
			}
			cal.add(Calendar.DATE, 1);
			d = cal.getTime();
		}
		if (d.after(finishDate) && d.getDay() == finishDate.getDay()) {//如果在同一天  不是周末也算是一天
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if (day < 7 && day > 1) {
				count++;
			}
		}
		return count;//从今天到明天算一个工作日
	}

	/**
	 * 得到指定日期对应的季度季末日期
	 * 
	 * @param date 指定日期
	 * @return 指定日期对应的季度季末日期
	 */
	public static Date getSeasonEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Integer y = cal.get(Calendar.YEAR);
		String dateString = y.toString();
		int m = cal.get(Calendar.MONTH);
		switch (m) {
		case 0:
		case 1:
		case 2:
			dateString += "-03-31";
			break;
		case 3:
		case 4:
		case 5:
			dateString += "-06-30";
			break;
		case 6:
		case 7:
		case 8:
			dateString += "-09-30";
			break;
		case 9:
		case 10:
		case 11:
		default:
			dateString += "-12-31";
			break;
		}
		return parse(dateString);
	}

	/**
	 * 得到指定日期对应的季度名称
	 * 
	 * @param date 指定日期
	 * @return 指定日期对应的季度名称
	 */
	public static String getSeasonName(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Integer y = cal.get(Calendar.YEAR);
		String dateString = y.toString() + "年";
		int m = cal.get(Calendar.MONTH);
		switch (m) {
		case 0:
		case 1:
		case 2:
			dateString += "一";
			break;
		case 3:
		case 4:
		case 5:
			dateString += "二";
			break;
		case 6:
		case 7:
		case 8:
			dateString += "三";
			break;
		case 9:
		case 10:
		case 11:
		default:
			dateString += "四";
			break;
		}
		return dateString;
	}

	/**
	 * 得到指定日期对应的周末日期
	 * 
	 * @param date 指定日期
	 * @return 指定日期对应的周末日期
	 */
	public static Date getWeekEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Date rDate = new Date();
		int i = cal.get(Calendar.DAY_OF_WEEK);
		if (i == 1) {
			rDate.setTime(date.getTime());
		} else {
			rDate = addDate(date, 8 - i);
		}
		return rDate;
	}

	/**
	 * 得到工作日天数ggd
	 * 
	 * @param startDate 开始日期
	 * @param finishDate 结束日期
	 * @param workweeks 存放工作日的星期的数组
	 * @return 工作日天数
	 * @throws java.text.ParseException
	 */
	public static int workDays(Date startDate, Date finishDate, int[] workweeks) throws ParseException {
		if (startDate.equals(finishDate)) {
			return 0;
		}
		Date tempDate = startDate;
		if (finishDate.before(startDate)) {
			startDate = finishDate;
			finishDate = tempDate;
		}
		int days = daysBetween(startDate, finishDate);
		int temp1 = days / 7 * workweeks.length;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		finishDate = format.parse(format.format(finishDate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		int temp2 = cal.get(Calendar.DAY_OF_WEEK);
		int temp3 = days - days / 7 * 7;
		for (int i = 0; i <= temp3; i++) {
			int weekOfDay = (temp2 - 1 - i) + 8 / 7;
			if (isWorkDay(weekOfDay, workweeks)) {
				temp1++;
			}
		}
		return temp1;
	}

	/**
	 * 计算两天之间相差的天数
	 * 
	 * @param startDate 开始日期
	 * @param finishDate 结束日期
	 * @return 两天之间的天数
	 * @throws java.text.ParseException
	 */
	public static int daysBetween(Date startDate, Date finishDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		startDate = format.parse(format.format(startDate));
		finishDate = format.parse(format.format(finishDate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		long t1 = cal.getTimeInMillis();
		cal.setTime(finishDate);
		long t2 = cal.getTimeInMillis();
		long betweenDays = (t1 - t2) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(betweenDays));
	}

	/**
	 * 通过星期判断是否是制定的工作日
	 * 
	 * @param d 星期
	 * @param workweeks 工作日的星期的集合
	 * @throws java.text.ParseException
	 */
	public static boolean isWorkDay(int d, int[] workweeks) {
		for (int i = 0; i < workweeks.length; i++) {
			if (workweeks[i] == d) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 计算两个日期之间天数的差，包括开始那天，不包括结束
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static int getDiffDays(Date startDate, Date endDate) {
		if (!endDate.after(startDate)) {
			return 0;
		}
		long s = startDate.getTime() - startDate.getTime() % (60000 * 60 * 24);
		long e = endDate.getTime() - endDate.getTime() % (60000 * 60 * 24);
		return (int) ((e - s) / (60000 * 60 * 24));
	}

	/**
	 * 计算两个时间之间工作日的天数
	 *
	 * @param startDate 开始日期
	 * @param finishDate 结束日期
	 * @param holidayList 节假日(不包括周六日)
	 * @param weekWorkList 周六日上班
	 * @return
	 */
	public static double workDaysWithoutHoliDay(Date startDate, Date finishDate, List<Date> holidayList, List<Date> weekWorkList) {
		if(finishDate.before(startDate)){
			return -1;
		}
		startDate = DateUtil.parse(DateUtil.format(startDate));
		Calendar cal = Calendar.getInstance();
		if (startDate.equals(finishDate)) {
			cal.setTime(startDate);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if(((day==1 || day==7) && !weekWorkList.contains(startDate)) || !holidayList.isEmpty()){
				return 0;
			}
			return 1;
		}
		Date d = startDate;
		cal.setTime(d);
		int count = 0;
		while (!d.after(finishDate)) {
			int day = cal.get(Calendar.DAY_OF_WEEK);
			if (((day < 7 && day > 1) || weekWorkList.contains(d)) && !holidayList.contains(d)) {
				count++;
			}
			cal.add(Calendar.DATE, 1);
			d = cal.getTime();
		}
		return count;
	}

}
