package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoop {

	public static void main(String[] args) {
	
		int i = 0;
		
		while ( i < 10 ) {
		
			i++;
			
			if ( i==5 ) {
				break;
			}

			System.out.println(i);

		}
		
		
		/*
		do {
			
			System.out.println(i);
			i++;
			
		} while ( i > 10 );
        */
	}
}
