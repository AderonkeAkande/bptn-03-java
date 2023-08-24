package com.bptn.course._05_strings;

public class Strings {

	/*
	 * A String is a data structure that holds a sequence of characters.
	 * 
	 * Strings are immutable - cannot change.
	 */
	
	public static void main(String[] args) {
		
		
		char[] str0 = { 'B', 'P', 'T', 'N' };
		
//		String str1 = new String(str0);
		
		String str1 = "Hello";
			
		System.out.println(str1);
		
		int size = str1.length();
		System.out.println(str1.length());
		
		String str2 = "BPTN";
		
		// String concatenation
		String str3 = str1 + " " + str2;
		System.out.println(str1 + " " + str2);
		
		String str4 = str1.concat(" ").concat(str2);
		System.out.println(str4);
		
		// String trim
		
		String str5 = "   Hello   ";
		System.out.println("--->" + str5.trim() + "<---");
		str5 = str5.trim();
		System.out.println("--->" + str5 + "<---");

		// Grab a String character
		
		String str6 = "Hello";
		//             01234
		
		System.out.println(str6.charAt(1));
		
		/*
		 * Check if a string is a substring of another string
		 * 
		 * Hello BPTN
		 * 
		 * --> llo
		 * 
		 */
		
		String str7 = "Hello BPTN";
		
		System.out.println( str7.contains("llo") );
		
		/*
		 * String comparison
		 */
		
		String str8 = new String("HellO");
		String str9 = "Hello";
		
		
		System.out.println( str8.equals(str9) );
		System.out.println( str8.equalsIgnoreCase(str9) );
		
		String str10 = "Hello BPTN";
		//              0123456789
		
		System.out.println(str10.replace("llo", "ab"));
		System.out.println(str10.replace('o', 'a'));
		System.out.println(str10.replace("o", "a"));
		//str10 = str10.replace("o", "a");
		System.out.println(str10);

		/* Sub Strings */
		System.out.println(str10.substring(6));
		System.out.println(str10.substring(6,9)); // EndIndex is not included.
		
		
		String str11 = "Hello";
		//              01234
		str11= "BPTN";
		
		System.out.println(str11.indexOf("ll"));
		
		String str12 = "AZ";
		String str13 = "AC";

		String str14 = "Test";
		String str15 = "Test1";
		String str16 = "Test2";
		
		System.out.println(str12.compareTo(str13));
		
	}

}
