package Film1;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie arg0, Movie arg1) {
		if(arg0.getRating() < arg1.getRating()) return -1;
		if(arg0.getRating() > arg1.getRating()) return 1;
		else return 0;
	}

}    