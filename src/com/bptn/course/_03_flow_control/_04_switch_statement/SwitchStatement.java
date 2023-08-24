package com.bptn.course._03_flow_control._04_switch_statement;

public class SwitchStatement {

	/*
	 * Write a Java program that translates the days number into the day's name according to:
	 * 
	 * 1 -> Monday
	 * 2 -> Tuesday
	 * 3 -> Wednesday
	 * 4 -> Thursday
	 * 5 -> Friday
	 * 6 -> Saturday
	 * 7 -> Sunday
	 * Other -> Invalid Day
	 */
	
	 public static void main(String[] args) {
		    
		 
		    /*
		     * Traditional Switch (needs break)
		     */
		    int day = 4;
		    
		    switch (day) {
		      case 1,10,20:
		        System.out.println("Monday");
                break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		      default:
		    	System.out.println("Invalid Day");
		    	  
		    }
		    
		    /*
		     * Simplified Switch - doesn't need break - As of Java 14
		     */
		    
		    switch (day) {
		      case 1,8 -> System.out.println("Monday");
		      case 7 -> {
		    	         System.out.println("Sunday");
              		     System.out.println("Sunday");
              		     }
		      case 4 -> System.out.println("Thursday");
		      case 2 -> System.out.println("Tuesday");
		      case 3 -> System.out.println("Wednesday");
		      case 5 -> System.out.println("Friday");
		      case 6 -> System.out.println("Saturday");
		      default -> System.out.println("Invalid Day");
		    	  
		    }

		    /*
		     * Simplified Switch - return value
		     */
		    String name = switch (day) {
		      case 1,8 -> "Monday";
		      case 7 -> "Sunday";
		      case 4 -> "Thursday";
		      case 2 -> "Tuesday";
		      case 3 -> "Wednesday";
		      case 5 -> "Friday";
		      case 6 -> "Saturday";
		      default -> "Invalid Day";   	  
		    };
		    
		    System.out.println(name);
	 
	 
	 }
	 
	 
}
