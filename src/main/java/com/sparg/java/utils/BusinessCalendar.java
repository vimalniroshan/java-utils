package com.sparg.java.utils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.NotImplementedException;
//import org.jbpm.calendar.Duration;
//import org.jbpm.calendar.Holiday;

//import org.jbpm.calendar.Day;

/**
 * @author: vimal.sengoden
 * Date: 5/24/2016
 * Time: 3:29 PM
 */
public class BusinessCalendar extends GregorianCalendar {

	public static enum Day {
		MONDAY(Calendar.MONDAY),
		TUESDAY(Calendar.TUESDAY),
		WEDNESDAY(Calendar.WEDNESDAY),
		THURSDAY(Calendar.THURSDAY),
		FRIDAY(Calendar.FRIDAY),
		SATURDAY(Calendar.SATURDAY),
		SUNDAY(Calendar.SUNDAY);

		private int javaCalanderDay;

		private Day(int javaCalanderDay) {
			this.javaCalanderDay = javaCalanderDay;
		}
	};

	public static class Holiday {
		private int date;
		private int month;

		public Holiday(final int date, final int month) {
			this.date = date;
			this.month = month;
		}
	}

	public static class Duration {
		public static class Time {
			private int hour;
			private int minute;

			public Time(final int hour, final int minute) {
				this.hour = hour;
				this.minute = minute;
			}

			public int getHour() {
				return hour;
			}

			public int getMinute() {
				return minute;
			}
		}

		private Time from;
		private Time to;

		public Duration(final Time from, final Time to) {
			this.from = from;
			this.to = to;
		}

		public Time getFrom() {
			return from;
		}

		public Time getTo() {
			return to;
		}
	}

	private List<Holiday> holidays;
	private Map<Day, Duration> businessHours;
	private List<Day> weekends = Arrays.asList(Day.SATURDAY, Day.SUNDAY);

	@Override
	public void add(final int field, final int amount) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}

	@Override
	public void roll(final int field, final boolean up) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}

	@Override
	public int getMinimum(final int field) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}

	@Override
	public int getMaximum(final int field) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}

	@Override
	public int getGreatestMinimum(final int field) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}

	@Override
	public int getLeastMaximum(final int field) {
		throw new NotImplementedException("Yet to implement"); //TODO: Yet to implement
	}
}
