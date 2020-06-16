import java.util.ArrayList;

public class DevelopersList {

	public static void main(String[] args) {
		ArrayList<String> devs = new ArrayList<>(); 
		  // 1. Type of data stored in ArrayList
		  // adding data to the list
		  devs.add("Johny");
		  devs.add("Valerya");
		  devs.add("Tatyana");
		  devs.add("Peter");
		  devs.add("Marry");
		  
		  // showing the initials, use "charAt(index)" from "String" class
		  int counter = 1;
		  for( String s : devs ) {          
		      System.out.println(counter + ". " + '"' + s.charAt(0) + "." + '"');
		      counter++;
		  }
		  
		// the longest name, use "length()" from "String" class
		  String max = devs.get(0);
		  for( String s : devs ) {          
		      if (s.length() > max.length()){
		    	  max = s;
		      }
		  }
		  System.out.println("The longest name is: " + max);
		  
		// swap values
		  String temp;
		  temp = devs.get(0);
		  devs.set( 0, (devs.get( devs.size()-1)) );
		  devs.set( (devs.size()-1), temp );
		  
		  System.out.println(devs.toString());
	}  

}
