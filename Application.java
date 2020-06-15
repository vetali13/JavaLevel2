import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		 ArrayList<Double> temps = new ArrayList<Double>(); 
		 
		Double minRange = -25.0d;
		Double maxRange = 25.0d;
		Random randomTemperature = new Random();
		NumberFormat formatter = new DecimalFormat("#0.0");
		
		int i = 0;
		while (i <=31) {
			Double genTemp = randomTemperature.nextDouble() * (maxRange - minRange) + minRange;
			temps.add(Double.valueOf(formatter.format(genTemp)));
			
			 i++;
		 }

		String weekDays[] = { "MO", "TU", "WD", "TH", "FR", "SA", "SU" };
		int counter = 0;
		for( double t : temps ) {
			if (counter == 0) {
				for (String s : weekDays) {
					System.out.printf("%7s", s);
				}
				System.out.println();
				counter++;
			}
			System.out.printf("%6.1fC", t);
			if (counter % 7 == 0) {
				System.out.println();
			}
			counter++;
		  }
		  
		System.out.println("\n");
		  
		Double max, min, avg;
		max = temps.get(0);
		min = temps.get(0);
		avg = temps.get(0);
		Double sum = 0.0d;
		for( double t: temps ) {
			  if (t > max) {
				  max = t;
			  }
			  else if (t < min) {
				  min = t;
			  }
			  
			  sum += t;
			  avg = sum / temps.size();
		}
		  avg = Double.valueOf(formatter.format(avg));
		  System.out.println("Maximum temperature: " + max + "\n"
				  + "Minimum temperature: " + min + "\n"
				  + "Average temperature: " + avg);
	}	
}
