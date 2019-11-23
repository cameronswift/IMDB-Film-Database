
public class Person 
{
	public int titleId;
	public int ordering;
	public int nconst;
	public String category;
	public String job;
	public String[] characters;
	
	public Person(int titleId, int ordering, int nconst, String category, String job, String[] characters) 
	{
		this.titleId = titleId;
		this.ordering = ordering;
		this.nconst = nconst;
		this.category = category;
		this.job = job;
		this.characters = characters;
	}
}