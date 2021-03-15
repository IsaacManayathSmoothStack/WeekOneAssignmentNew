package com.im.assignments.weekfivedayfive;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import org.hamcrest.generator.qdox.parser.ParseException;

/**
 * Week 1, Day 5 assignment
 * Date-Time API questions
 * @author Isaac Manayath
 */

public class DateTimeAPI {
	
	public static void main(String []args) {
	
	//Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
	//java.util.Date;
	System.out.println("Birthday within a nanosecond");
	Date birthDate = Timestamp.from(Instant.now()); 
	System.out.println(birthDate);
	System.out.println();

	//Given a random date, how would you find the date of the previous Thursday?
	System.out.println("Given a random date, how would you find the date of the previous Thursday?");
	LocalDate date = LocalDate.now();
	LocalDate lastThursdayDate = date.with(DayOfWeek.THURSDAY);
	System.out.println(lastThursdayDate);

	//What is the difference between a ZoneId and a ZoneOffset?
	// a ZoneId is an English representation of a timezone, whereas a
	// ZoneOffset is a numerical offset from GMT (Greenwich Meridian Time)

	//How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
    System.out.println("Convert an Instant to ZonedDateTime?");
    Instant instant = Instant.now();
    System.out.println("Instant : " + instant);
    ZonedDateTime easternTime = instant.atZone(ZoneId.of("America/New_York"));
    System.out.println("ZonedDateTime : " + easternTime);
    System.out.println("OffSet : " + easternTime.getOffset());
    System.out.println();
	
	System.out.println("Convert a ZonedDateTime to an Instant?");
    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println(zdt);
    Instant instant2 = zdt.toInstant();
    Date date2 = Date.from(instant2);
    System.out.println(date2);
    System.out.println();

			    
	//Write an example that, for a given year, reports the length of each month within that year.
    String [] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
	System.out.println("Write an example that, for a given year, reports the length of each month within that year.");
	LocalDate year = LocalDate.now();
	//System.out.println(year.lengthOfMonth());
	String a = year.toString();
	//System.out.println(a);
	String year3 = "";
	year3 = a.substring(0, 4);
	for(int i = 0; i < 12; i++) {
		String date5 = "";
		date5 = year3 + "-" + months[i] + "-01"; 
		//System.out.println(date5);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dt = LocalDate.parse(date5, dtf);
		System.out.println(dt.lengthOfMonth());
	}

	//Write an example that, for a given month of the current year, lists all of the Mondays in that month.
	System.out.println("Write an example that, for a given month of the current year, lists all of the Mondays in that month.");
	Month month = null;

	month = java.time.Month.MARCH;
	
    System.out.printf("For the month of %s:%n", month);
    LocalDate date5 = Year.now().atMonth(month).atDay(1).
          with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    Month mi = date5.getMonth();
    while (mi == month) {
        System.out.printf("%s%n", date);
        date5 = date5.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        mi = date5.getMonth();
    }

	System.out.println();

	//Write an example that tests whether a given date occurs on Friday the 13th.
	System.out.println("Write an example that tests whether a given date occurs on Friday the 13th.");
	
    int yearFri13 = 2012; //user input
    String dateString = "01/13/"+yearFri13;
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date dateFri13 = null;
	try {
		dateFri13 = dateFormat.parse(dateString);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Calendar cal = Calendar.getInstance();
    cal.setTime(dateFri13);
    
    int counter = 0;
    int monthFri13 = 0;
    while(monthFri13++ <= 12){
       if(Calendar.FRIDAY == cal.get(Calendar.DAY_OF_WEEK)){
          counter++;
       }
       cal.add(Calendar.MONTH, 1);
    }

  System.out.println("Number of Fridays on 13th = "+ counter);  

System.out.println();
	}

}
