package examples;

import java.util.Random;

public class ArrayExampleTwo {
	final static int NUMBER = 2;
	public static void run() {
		System.out.println("EXAMPLE " + NUMBER + " START");
		
		//Temperatures
		float temperaturesWeek[] = { -0.5f, 1.5f, 0.0f, 5.0f, 5.5f, 10.0f, -5.0f };
		
		//HW2: printf
		String weekDays[] = { "MO", "TU", "WD", "TH", "FR", "SA", "SU" };
		for (int i = 0; i < temperaturesWeek.length; i++) {
			System.out.printf("%s %6.2fC\n", weekDays[i], temperaturesWeek[i]);
			}
		
		//HW3: find  min/max
		float maxTemperature = temperaturesWeek[0];
		float minTemperature = temperaturesWeek[0];
		
		for (int i = 1; i < temperaturesWeek.length; i++) {
			if (temperaturesWeek[i] > maxTemperature) {
				maxTemperature = temperaturesWeek[i];
				}
			if (temperaturesWeek[i] < minTemperature) {
				minTemperature = temperaturesWeek[i];
				}
			}
		System.out.printf("Maximum temperature: %6.2fC\nMinimum temperature: %6.2fC\n", maxTemperature, minTemperature);
		
		//HW4: initialize values random() -10 .. 20
		float minRange = -10.0f;
		float maxRange = 20.0f;
		Random randomTemperature = new Random();
		float[] temperaturesWeekRandom = new float[7];
		
		for (int i = 0; i < temperaturesWeekRandom.length; i++) {
			temperaturesWeekRandom[i] = randomTemperature.nextFloat() * (maxRange - minRange) + minRange;
			}
		
		System.out.printf("Randomly generated temperatures are: ");
		for (float twr : temperaturesWeekRandom) {
			System.out.printf("%6.2fC", twr);
			}
		
		
		System.out.println("\nEXAMPLE " + NUMBER + " END");
		}
	}
