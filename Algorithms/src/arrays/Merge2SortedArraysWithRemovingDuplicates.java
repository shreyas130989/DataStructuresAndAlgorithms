package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Merge2SortedArraysWithRemovingDuplicates {

	static int[] a = {1,2,3,4,5,7,9};
	static int[] b = {2,3,4,5,6,10};
	
	static class Movie {
		Double rating;
		String movieName;
		
		public Movie(String movieName, Double rating) {
			this.movieName = movieName;
			this.rating = rating;
		}
		
		public Double getRating() {
			return rating;
		}
	}
	
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
		        new Movie("Lord of the rings", 8.8),
		        new Movie("Back to the future", 10.0),
		        new Movie("Carlito's way", 7.9),
		        new Movie("Pulp fiction", 8.9));
		movies.sort(Comparator.comparingDouble(Movie::getRating)
		                      .reversed());
		for(Movie movie: movies) {
			System.out.println(movie.getRating());
		}
		//movies.forEach(System.out::println);
		
		Set<Integer> resultSet = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			resultSet.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			resultSet.add(b[i]);
		}
		Iterator<Integer> resultIterator = resultSet.iterator();
		while(resultIterator.hasNext()) {
			System.out.println(resultIterator.next());
		}
	}
}
