package Film1;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		   list.add(new Movie("Force Awakens", 8.3, 2015)); 
	        list.add(new Movie("Star Wars", 8.7, 1977)); 
	        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
	        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
	        
	        Collections.sort(list);
	        System.out.println("Years");
	        for(Movie m :list) {
	        	System.out.println(m.getName() + "  " + m.getRating() + "  " + m.getYear());
	        }
	        System.out.println("Rating");
	        RatingCompare rate = new RatingCompare();
	        Collections.sort(list,rate);
	        for(Movie m : list) {
	        	System.out.println(m.getName() + "   " + m.getRating() + "   " + m.getYear());
	        }
	        
	       NameCompare name = new NameCompare();
	       Collections.sort(list,name);
	       System.out.println("Names");
	       for(Movie m: list) {
	    	   System.out.println(m.getName() + "   " + m.getRating()+ "   "+ m.getYear());
	       }
	       
	       YearCompare year = new YearCompare();
	       Collections.sort(list, year);
	       
	       System.out.println("555§§§§§§");
	       
	       for(Movie m: list) {
	    	   System.out.println(m.getName() + "  " + m.getRating() + "   " + m.getYear());
	       }

	}

}
