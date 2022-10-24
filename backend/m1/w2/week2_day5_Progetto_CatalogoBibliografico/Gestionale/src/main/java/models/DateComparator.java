package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
  
public class DateComparator {
	
	// Java program for the above approach
	  

	
	  
	    // Function to print difference in
	    // time start_date and end_date
	    static void
	    findDifference(String start_date,
	                   String end_date)
	    {
	  
	        // SimpleDateFormat converts the
	        // string format to date object
	        SimpleDateFormat sdf
	            = new SimpleDateFormat(
	                "dd-MM-yyyy HH:mm:ss");
	  
	        // Try Block
	        try {
	  
	            // parse method is used to parse
	            // the text from a string to
	            // produce the date
	            Date d1 = sdf.parse(start_date);
	            Date d2 = sdf.parse(end_date);
	  
	            // Calucalte time difference
	            // in milliseconds
	            long difference_In_Time
	                = d2.getTime() - d1.getTime();
	        }
	 
	  
	        // Catch the Exception
	        catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	        // Given start Date
	        String start_date
	            = "10-01-2018 01:10:20";
	  
	        // Given end Date
	        String end_date
	            = "10-06-2020 06:30:50";
	  
	        // Function Call
	        findDifference(start_date, end_date);
	    }
	}


