package services;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HrFunctions {

	private HrFunctions() {
		// TODO Auto-generated constructor stub
	}

	public static int LevelToInt(String value) {
		if (value.equals("Elementary"))
			return 1;
		if (value.equals("Limited"))
			return 2;
		if (value.equals("Professional"))
			return 3;
		if (value.equals("Full"))
			return 4;
		if (value.equals("Native"))
			return 5;
		return 1;
	}

	public static Date parseStringToDate(String dateString) {// mm/dd/yyyy
																// format parser
		String[] dateArray = dateString.split("/");// split dateString to string
													// array of date number
		Calendar cal = Calendar.getInstance();// fill here a date
		cal.set(Calendar.YEAR, Integer.parseInt(dateArray[2]));
		cal.set(Calendar.MONTH, Integer.parseInt(dateArray[0]) - 1);
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateArray[1]));

		Date date = cal.getTime();// create a date

		return date;
	}

	public static Date parseStringToDate(String month, String year) {// mm/dd/yyyy
		// array of date number
		Calendar cal = Calendar.getInstance();// fill here a date
		cal.set(Calendar.YEAR, Integer.parseInt(year));
		cal.set(Calendar.MONTH, Integer.parseInt(month));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt("01"));// set default
																// day of month
																// to 1

		Date date = cal.getTime();// create a date

		return date;
	}

	public static void redirect(String location, HttpServletRequest request,
			HttpServletResponse response) {
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/WEB-INF/views/" + location);
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher dispatcherEx;
			dispatcherEx = request
					.getRequestDispatcher("/WEB-INF/views/index.html");
		}

	}
	
	}


