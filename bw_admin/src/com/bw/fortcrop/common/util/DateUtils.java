package com.bw.fortcrop.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.Logger;
/**
 * 文件名：DateUtils.java
 * 类名：DateUtils
 * TODO:
 */
public class DateUtils {
	private static Logger logger=Logger.getLogger(DateUtils.class);
	/**
	 * 日期转换
	 * */
	public final static String PATTERN1="yyyy-MM-dd";
	public final static String PATTERN3="yyyy年MM月dd日";
	public final static String PATTERN2="yyyy-MM-dd HH:mm:ss";
	/**
	 * 生成日期格式（yyyy-MM-dd)
	 * */
	public static Date getDate(String value){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN1);
		Date date=null;
		try {
			 date=format.parse(value);
		} catch (ParseException e) {
			logger.debug("字符串转换日期异常:"+value, e);		
		}
		return date;
	}
	/**
	 * 生成日期格式（yyyy-MM-dd HH:mm:ss)
	 * */
	public static Date getFullDate(String value){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN2);
		Date date=null;
		try {
			 date=format.parse(value);
		} catch (ParseException e) {
			logger.debug("字符串转换日期异常:"+value, e);		
		}
		return date;
	}
	@SuppressWarnings("deprecation")
	public static int getThisYear(){
		int year=Calendar.getInstance().getTime().getYear();
		return year;
	}
	/**获取指定日期的年份*/
	public static String getYear(Date date){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN1);
		String dateString=format.format(date);
		String[] dateChar=dateString.split("-");
		return dateChar[0];
	}
	/**获取指定日期的月份*/
	public static String getMonth(Date date){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN1);
		String dateString=format.format(date);
		String[] dateChar=dateString.split("-");
		return dateChar[1];
	}
	/**获取指定日期的天数*/
	public static String getDay(Date date){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN1);
		String dateString=format.format(date);
		String[] dateChar=dateString.split("-");
		return dateChar[2];
	}
	
	/**
	 * 根据日期字符串，获取指定字符串年份值
	 * */
	public static String getYearString(String date){
		String[] dateChar=date.split("-");
		return dateChar[0];
	}
	/**
	 * 根据日期字符串，获取指定字符串月份值
	 * */
	public static String getMonthString(String date){
		String[] dateChar=date.split("-");
		return dateChar[1];
	}
	/**
	 * 根据日期字符串，获取指定字符串天数值
	 * */
	public static String getDayString(String date){
		String[] dateChar=date.split("-");
		return dateChar[2];
	}
	
	/**
	 * 将指定日期转换为字符串日期
	 * */
	public static String getDateStringInfo(Date date){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN1);
		return format.format(date);
	}
	/**
	 * 将指定日期转换为中文字符串日期
	 * */
	public static String getZNDateString(Date date){
		SimpleDateFormat format=new SimpleDateFormat(PATTERN3);
		return format.format(date);
	}
	
	/**
	 * 得到日期相差月数
	 * */
	public static int getNumber(Date startDate,Date endDate){

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(startDate);
        c2.setTime(endDate);
        int result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        return result == 0 ? 1 : Math.abs(result);
	}
	public static void main(String[] args) {
//		System.out.println(getDate("2014-04-01"));
//		System.out.println(getFullDate("2014-04-01 09:22:00"));
//		System.out.println(getThisYear());
//		//System.out.println(new Date().getYear());
//		getYear(new Date());
		//System.out.println(getNumber(new Date(), new Date()));
		
		
	}
}
