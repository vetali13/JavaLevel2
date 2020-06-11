import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private List<String> ingredients;
	

	public Pizza() {
		this.ingredients = new ArrayList<>();
	}
	
	public Pizza(String dough, String salt, String oil){
        this();
        if ( ( dough.equals( "thin" ) ) || ( dough.equals( "thick" ) )  ) {
        	ingredients.add(dough);
        }
        else {
        	ingredients.add(null);
        	System.out.println("The dough is not set correctly, should be either thin or thick");
        }
        if ( ( salt.equals( "iodized" ) ) || ( salt.equals( "halit" ) )  ) {
        	ingredients.add(salt);
        }
        else {
        	ingredients.add(null);
        	System.out.println("The salt is not set correctly, should be either iodized or halit");
        }
        if ( ( oil.equals( "sunflower" ) ) || ( oil.equals( "olive" ) )  ) {
        	ingredients.add(oil);
        }
        else {
        	ingredients.add(null);
        	System.out.println("The oil is not set correctly, should be either sunflower or olive");
        }
        
    }

    public Boolean isComplete(){
    	if ( ( this.ingredients.size() < 4 ) || ( this.ingredients.subList(0, 3).contains(null) ) ) {
    		return false;
    	}
   
    	return true;
     }
    

    // CHAINING METHODS
    public Pizza with(String ingredient){
        if (this.ingredients.size() > 2 ) {
        	if (this.ingredients.contains(ingredient)) {
        		System.out.println("Your pizza already has " + ingredient);
        		return this;
        	}
        	else {
        		this.ingredients.add(ingredient);
        		System.out.println("The " + ingredient + " has been added!");
        		return this;
        	}
        }
        else {
        	System.out.println("Your pizza does not have basic ingredients!");
        	return this;
        }	
        	
    }

    public Pizza without(String ingredient){
        if ( this.ingredients.indexOf(ingredient) > 2 ) {
        	this.ingredients.remove(ingredient);
        	System.out.println(ingredient + " has been removed!");
        	return this;
        }
        else {
        	System.out.println("Cannot remove " + ingredient);
        	return this;
        }
    }

    public String toString() {
        String string = "Your pizza:\n\t";
        for (String s : this.ingredients) {
        	string += s + "\n\t";
        }
        return string;
        
    }

	public List<String> getIngredients() {
		return ingredients;
	}
    
}
