package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		 // CLIENT WISHES
		ArrayList<String> listOfWishes = new ArrayList<>();
		listOfWishes.addAll(Arrays.asList(
				"Spaghetti,2",
				"Pepper,5",
				"Sugar,1"
				));
		
		System.out.println(listOfWishes.toString());
		
		// STORE OFFERS
		ArrayList<String> listOfOffers = new ArrayList<>();
		listOfOffers.addAll(Arrays.asList( 
			    "Spaghetti,10.00", 
			    "Sugar,5.00",
			    "Water,2.50"
			  )); 
		 
		// CLIENT FULFILLED WISHES
		 ArrayList<String> listOfPurchases = new ArrayList<>();
		
		for (int i = 0; i < listOfWishes.size(); i++) {
			float f1 = 0.0f;
			for (int j = 0; j < listOfOffers.size(); j++) {
				
				if (listOfWishes.get(i).split(",")[0].equals(listOfOffers.get(j).split(",")[0])) {
			
					f1 = Float.valueOf(listOfWishes.get(i).split(",")[1]) * 
							Float.valueOf(listOfOffers.get(j).split(",")[1]);
					listOfPurchases.add(listOfWishes.get(i) + "=" + f1);
				}
			}
		}
		
		System.out.println(listOfPurchases.toString());
	}
}
