package Film1;

public class Movie implements Comparable<Movie>{
	private double rating; 
    private String name; 
    private int year;
	
	public Movie() {};
	

	public Movie(String string, double d, int i) {
		this.name = string;
		this.rating = d;
		this.year = i;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
    
}
