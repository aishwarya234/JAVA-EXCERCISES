package com.deloitte.dept.utils;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//Function for convertion of date to sql format
public class ConvertDate {
	public static Date parseDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date sqldate=null;
		try {
			java.util.Date dt = sdf.parse(date);
			sqldate = new Date(dt.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqldate;
	}

}

