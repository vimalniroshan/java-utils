package com.sparg.java;

import java.util.Calendar;
import java.util.Date;

import org.jbpm.calendar.BusinessCalendar;

/**
 * @author: vimal.sengoden
 * Date: 11/18/2014
 * Time: 2:55 PM
 */
public class Test {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2015, 1, 17);

        Calendar c1 = Calendar.getInstance();
        c1.set(2016, 1, 11);
        //System.out.println(getEarningPeriod(c, c1, PremiumPlanTypeEnum.ANNUAL));

        BusinessCalendar bc = new BusinessCalendar();
        c = Calendar.getInstance();
        c.set(2016, 4, 27);
        System.out.println(c.getTime());
        Date d = bc.findStartOfNextDay(c.getTime());//, new Duration(1000 * 60 * 60 * 8));
        System.out.println(d);
    }
}
