package com.bptn.course._03_flow_control._03_if_statement;

public class IfStatement {

	public static void main(String[] args) {

		int a = 12;
		int b = 12;
		
		// Approach 1
		if (a>b) {
			System.out.println("a is bigger than b");
		}
		else if(a<b) {			
			System.out.println("b is bigger than a");			
		}
		else if(a<b) {			
			System.out.println("b is bigger than a");			
		}
		else {
			System.out.println("a equals b");			
		}

		// Approach 2

		if (a>b) {
			System.out.println("a is bigger than b");
		}	
		
		if (a<b) {			
			System.out.println("b is bigger than a");			
		}

		if (a==b) {
			System.out.println("a equals b");			
		}
		
		// Nested If
	
		int c = 5;
		
		if (a>b) {
			
			if ( a < c) {
				System.out.println("c is bigger than a");								
			}
		}	
		
		String str;
		
		int x = 10;
		int y = 15;
		
		if ( x > y ) {
			str = "x is bigger than y";
		} 
		else {
			str = "y is bigger than x";			
		}
		
		System.out.println(str);
		
		// Ternary Operator
		
		str = ( x > y ) ? "x is bigger than y" : "y is bigger than x";
		
		System.out.println(str);
		
		
	}

}
