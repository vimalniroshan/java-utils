package com.sparg.java;

import org.jbpm.calendar.BusinessCalendar;

import java.util.Calendar;
import java.util.Date;

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

        char ch1 = '|';
        char ch2 = '¦';
        char ch3 = '|';
        char ch4 = 'ª';
        char ch5 = '║';


        System.out.println(ch1 + " Ch1:" + ((int) ch1) + " from code  &#124; :" + Character.toChars(124)[0]);
        System.out.println(ch2 + " Ch2:" + ((int) ch2) + " from code  &#166; :" + Character.toChars(166)[0]);
        System.out.println(ch3 + " Ch3:" + ((int) ch3));
        System.out.println(ch4 + " Ch4:" + ((int) ch4));
        System.out.println(ch5 + " Ch5:" + ((int) ch5));


    }
}
