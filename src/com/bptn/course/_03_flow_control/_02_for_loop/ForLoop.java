package com.bptn.course._03_flow_control._02_for_loop;

public class ForLoop {

	public static void main(String[] args) {

		/*
		int i = 0;
		
		while ( i < 10 ) {
		
			i++;
			System.out.println(i);
		}*/
		
		/*
		 * traditional for-loop
		 */
		/*
		for (int i = 0; i < 10; i++) {
			
			if ( i==5 ) {
				break;
			}
			System.out.println(i);
		}*/

		/*
		 * for-each / enhanced for-loop / As of Java 5
		 */
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int num: numbers) {
			
			System.out.println(num);
		}
	}

}
