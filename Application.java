package main;

import java.util.Arrays;

import examples.ArrayExampleOne;
import examples.ArrayExampleThree;
import examples.ArrayExampleTwo;

public class Application {
	
	public static void main(String[] args) {
		//ArrayExampleOne.run();
		//ArrayExampleTwo.run();
		//ArrayExampleThree.run();
		
		 Integer[] data = { 100, 200, 300, 400, null };
		 
		 data = moveArrayToRight(data);
		 
		 System.out.println(Arrays.toString(data));
		 
		 data = moveArrayToLeft(data);
		 
		 System.out.println(Arrays.toString(data));
		 
		 data = moveArrayToRightFor(data);
		 
		 System.out.println(Arrays.toString(data));
		 
		 data = moveArrayToLeftFor(data);
		 
		 System.out.println(Arrays.toString(data));
		
	}
	
	// Method takes array[i] and replace it with array[i-1]
	// After while loop ends i = 0, and array[0] is set as null
	// The method returns the modified array with all members moved one step to the right and first member set as null
	public static Integer[] moveArrayToRight(Integer[] array){
        int i = array.length-1;
        while( i > 0 ){
            array[i--] = array[i];
        }
        array[i] = null;
        return array;
    }
	
	// Method takes array[i] and replace it with array[i+1]
	// After while loop ends i = array.length, and array[array.length] is set as null
	// The method returns the modified array with all members moved to left and last member set as null
	public static Integer[] moveArrayToLeft(Integer[] array){
        int i = 0;
        while( i < array.length - 1 ){
            array[i] = array[++i];
        }
        array[i] = null;
        return array;
    }
	
	public static Integer[] moveArrayToRightFor(Integer[] array){
		for (int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = null;
        return array;
    }
	
	public static Integer[] moveArrayToLeftFor(Integer[] array){
		for (int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length - 1] = null;
        return array;
    }

}
