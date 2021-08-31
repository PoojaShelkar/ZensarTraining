package Day6;

public class Actor {

	public static void main(String[] args) {
		
		 Movie m1 = new Movie("Horrible Bosses 2");
	        Movie m2 = new Movie("Mortdecai",2015);
	        
	        System.out.println("Title: " + m2.getTitle());
	        System.out.println("Year: " + m2.getReleaseDate());
	        m2.changeTitle("X-Men: Days of Future Past");
	        m2.setReleaseDate(2014);
	        System.out.println("Title: " + m2.getTitle());
	        System.out.println("Year: " + m2.getReleaseDate());
	    }   
	}