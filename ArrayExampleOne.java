package examples;

import java.util.Arrays;

public class ArrayExampleOne {
	final static int NUMBER = 1;
	public static void run() {
		System.out.println("EXAMPLE " + NUMBER + " START");
		
		int[] integers = {50, -10, 40, -30, 20};
		
		int negativeArrayLength = 0;
		int positiveArrayLength = 0;
		
		for (int i : integers) {
			
			if (i >= 0) {
				positiveArrayLength += 1;
			}
			else {
				negativeArrayLength += 1;
			}
		}
		
		int[] positiveArray = new int[positiveArrayLength];
		int[] negativeArray = new int[negativeArrayLength];
		
		int p = 0;
		int n = 0;
		
		for (int i : integers) {
			
			if (i >= 0) {
				positiveArray[p] = i;
				p++;
					}
			else {
				negativeArray[n] = i;
				n++;
				}
			}
				
		System.out.println("Positive array: " + Arrays.toString(positiveArray));
			
		System.out.println("Negative array: " + Arrays.toString(negativeArray));
		
		
		System.out.println("EXAMPLE " + NUMBER + " END");
	
	}
	
	
}
