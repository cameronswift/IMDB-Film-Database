
public class FilmTitle 
{
	int titleId;
	int ordering;
	String title;
	String region;
	String language;
	Boolean isOriginalTitle;
	
	public FilmTitle(int titleId, int ordering, String title, String region, String language, Boolean isOriginalTitle) 
	{
		this.titleId = titleId;
		this.ordering = ordering;
		this.title = title;
		this.region = region;
		this.language = language;
		this.isOriginalTitle = isOriginalTitle;
	}
	
	public void readFilmTitles()
	{
	}
	
	public void searchFilms()
	{
	}
	
	public void listRegions() /* list all regions for every film */
	{	
	}
	
	public void getFilmTitlesUsingRegion(String r) /* uses region as input, outputs films in that region */
	{
	}
	public void searchFilms(String s) /* uses user String input, outputs film titles that contains the user's input */
	{
	}
}