
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
}