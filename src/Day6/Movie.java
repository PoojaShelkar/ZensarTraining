package Day6;

public class Movie {

	
		 private String title;
		    private int year; 
		    
		    public Movie(String t)
		    {
		        title = t;
		    }
		    
		    public Movie(String t, int yearReleased)
		    {
		        title = t;
		        year = yearReleased;
		    }
		    
		    public String getTitle()
		    {
		        return title;
		    }
		    
		    public int getReleaseDate()
		    {
		        return year;
		    }
		    
		    public void changeTitle(String newTitle)
		    {
		        title = newTitle;
		    }
		    
		    public void setReleaseDate(int yr)
		    {
		        year = yr;
		    }
		

	}


