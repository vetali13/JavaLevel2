package examples;

import java.util.Arrays;

public class ArrayExampleThree {
	final static int NUMBER = 3;
	public static void run() {
		System.out.println("EXAMPLE " + NUMBER + " START");
		
		int[] data = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(data));
		
		data = delete(data, 2); //Delete element with index nr. 2 from array data
		System.out.println(Arrays.toString(data));
		
		System.out.println("\nInsertion task: ");
		data = insert(data, 2, 30); //Insert new element 30 on index 2 in array data
		System.out.println(Arrays.toString(data));
		
		//Insert-Delete Person arrays
		System.out.println("\nCreate and populate Person array: ");
		Person[] personArray = new Person[5];
		
		for (int i = 0; i < personArray.length; i++) {
			Person person = new Person("Person " + (i + 1));
			personArray[i] = person;
		}
		
		for (Person p : personArray) {
			System.out.printf("%s ", p.toString());
		}
		
		int personIndexToDelete = 2;
		System.out.println("\nDelete Person: " + (personIndexToDelete + 1));
		
		
		Person[] newPersonDeleted = new Person[personArray.length - 1];
		
		for(int oi = 0, ci = 0; oi < data.length; oi++) {
			if( oi != personIndexToDelete ) {
				newPersonDeleted[ ci++ ] = personArray[oi];
			}
		}
		
		personArray = newPersonDeleted;
		
		for (Person p : personArray) {
			System.out.printf("%s ", p.toString());
		}
		
		int personIndexToInsert = 2;
		Person personToInsert = new Person("Person " + (personIndexToInsert + 1));
		System.out.println("\nInsert Person: " + (personIndexToDelete + 1));
		Person[] newPersonInserted = new Person[personArray.length + 1];
		
		for(int oi = 0, ci = 0; ci < personArray.length + 1; ci++) {
			if ( ci == personIndexToInsert ) {
				newPersonInserted[ci] = personToInsert;
			}
			else {
				newPersonInserted[ci] = personArray[oi++];
			}
		}
		
		personArray = newPersonInserted;
		
		for (Person p : personArray) {
			System.out.printf("%s ", p.toString());
		}
		
		System.out.println("\nEXAMPLE " + NUMBER + " END");
	}
	
	public static int[] delete(int[] array, int indexToDelete) {
		if (indexToDelete < array.length) {
			System.out.println("Element with index nr. " + indexToDelete + " will be now deleted.");
			int[] newData = new int[array.length - 1];
			
			for(int oi = 0, ci = 0; oi < array.length; oi++) {
				if( oi != indexToDelete ) {
					newData[ ci++ ] = array[oi];
				}
			}
			return newData;
		}
		else {
			System.out.println("Index out of bound!");
			return array;
		}
		
	}
	
	public static int[] insert(int[] array, int indexToInsert, int newValue) {
		if (indexToInsert < array.length) {
			System.out.println("Element " + newValue + " will be now inserted with index nr. " + indexToInsert);
			int[] newData = new int[array.length + 1];
			
			for(int oi = 0, ci = 0; ci < array.length + 1; ci++) {
				if ( ci == indexToInsert ) {
					newData[ci] = newValue;
				}
				else {
					newData[ci] = array[oi++];
				}
			}
			return newData;
		
		}
		else {
			System.out.println("Index out of bound!");
			return array;
		}
	}
	
}

class Person{
	private String fullName;

	public Person(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return fullName;
	}
	
	
}
