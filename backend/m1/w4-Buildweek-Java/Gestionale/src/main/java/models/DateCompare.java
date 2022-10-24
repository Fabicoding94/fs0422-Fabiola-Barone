package models;



	
	
	// Java program for the above approach
	  
	import java.time.*;
	import java.util.*;
	  
	public class DateCompare {
	  
	    // Function to print difference in
	    // time start_date and end_date
	    static void findDifference(LocalDate startDate,
	                   LocalDate endDate)
	    {
	  
	        // find the period between
	        // the start and end date
	        Period diff
	            = Period
	                  .between(startDate,
	                           endDate);
	  
	        // Print the date difference
	        // in years, months, and days
	        System.out.print(
	            "Difference "
	            + "between two dates is: ");
	  
	        // Print the result
	        System.out.printf(
	            "%d years, %d months"
	                + " and %d days ",
	            diff.getYears(),
	            diff.getMonths(),
	            diff.getDays());
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	        // Start date
	        LocalDate startDate
	            = LocalDate.of(2018, 01, 10);
	  
	        // End date
	        LocalDate endDate
	            = LocalDate.of(2020, 06, 10);
	  
	        // Function Call
	        findDifference(startDate,
	                       endDate);
	    }
	}
	
//	Date dateBefore = new Date(2022, Calendar.APRIL, 21);
//	Date dateAfter = new Date(2022, Calendar.APRIL, 25);
//
//	long dateBeforeInMs = dateBefore.getTime();
//	long dateAfterInMs = dateAfter.getTime();
//
//	long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
//
//	long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
//	// Alternatevly: 
//	// int daysDiff = (int) (timeDiff / (1000 * 60 * 60 * 24));
//	System.out.println(" The number of days between dates: " + daysDiff);
//	

