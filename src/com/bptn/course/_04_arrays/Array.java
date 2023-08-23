package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int i0 = 4;
		int i1 = 5;
		int i2 = 7;
		int i3 = 2;
		int i4 = 14;
		int i5 = 35;
		int i6 = 46;
		int i7 = 71;
		int i8 = 28;
		int i9 = 19;
		
		/*
		 * An Array is data structure that holds a sequence of elements of 
		 * the same type.
		 * 
		 * Arrays are not resizable - ArrayList
		 */
		
		
		int[] a = { 4, 5, 7, 2, 14, 35, 46, 71, 28, 19, 101 };
        //          0  1  2  3   4   5   6   7   8   9	 10	
		
		int size = 10;
		
		a = null;
		
		System.out.println(a[a.length-1]);
		
		int[] b = new int[size];
		double[] c = new double[size];
		boolean[] boo = new boolean[size];
		
		String[] strs = {"Hello", "I", "love", "Java"};
		
		String[] strs2 = new String[size];
		
		strs2[0] = "Hello";
		
		//System.out.println(Arrays.toString(strs));
		
		//a[5] = -7;
		
			
		//System.out.println(a[4]);
				
		//System.out.println(a.length);
		
//		for (int i=0; i<=a.length; i++) {
//   	 		System.out.println(a[i]);
//		}
		
		/*
		for (int num: a) {
			System.out.println(num);
		}*/
		
		//System.out.println( Arrays.toString(a) );
		
		System.gc();
		
		String str = null;
		
	}

}
