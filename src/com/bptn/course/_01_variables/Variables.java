package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {

		/*
		   1. primitives - 8 primitives
		   2. reference type
		 */
				
		/*
		  Integer variables
		 */
		
		int num1 = 4;   // 4 bytes
        byte num2 = 50;  // 1 byte
        short num3 = 4000;  // 2 bytes
        long num4 = 32632653265326L; // 8 bytes
		
        /*
         * Decimal variables
         */
        float num5 = 4.56F; // 4 bytes
        double num6 = 43.4456; // 8 bytes
		
        /*
         * Boolean
         */
        
        boolean boo1 = true;
        boolean boo2 = false;
        
        /*
         * Text
         */
        
        char char1 = 'A';
        
        //String str1 = "Hello BPTN";
        
        
        //String str2 = new String("Coffee");
        //String str3 = new String("Coffee");

//        if (str2 == str3) {
//        	System.out.println("Equal");
//        }
//        else {
//        	System.out.println("Different");
//        }    

        
        //Primitives: ==
        //Reference types: equals()
        
        int scoreBptn = 80;
        
        String str1 = "Java";
        String str2 = "Java";
        
        str2 = "Hello " + "Java" + " Bptn";

        if( str1 == str2 ) {
            System.out.println("same");
        } 
        else {
            System.out.println("diffrent");
        }
        
        System.out.println(str2);
        
	}

}
