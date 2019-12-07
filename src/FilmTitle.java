import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilmTitle 
{
	public static Scanner input = new Scanner(System.in);
	public String comma = ",";
	public String titleId;
	public String ordering;
	public String title;
	public String region;
	public String language;
	public String type;
	public String attributes;
	public String isOriginalTitle;
	
	public FilmTitle(String csvString)
	{
		String csvParts[] = csvString.split(comma);
		titleId = csvParts[0];
		ordering = csvParts[1];
		title = csvParts[2];
		region = csvParts[3];
		language = csvParts[4];
		type = csvParts[5];
		attributes = csvParts[6];
		isOriginalTitle = csvParts[7];
	}
	
	public static void listRegions() /* list all regions for every film */
	{
		for (int i = 0; i<Start.films.size(); i++)
		{
			System.out.println(Start.films.get(i).getRegion());
		}
	}
	
	public static void getFilmTitlesUsingRegion(String r) /* uses region as input, outputs films in that region */
	{
		for (int i = 0; i<Start.films.size(); i++) 
		{
			if (Start.films.get(i).getRegion().equals(r))
			{
				System.out.printf("Movie Title: %s", Start.films.get(i).getTitle());
			}
		}
	}
	
	public static void searchFilms(String s) /* uses user String input, outputs film titles that contains the user's input */
	{
		for (int i = 0; i<Start.films.size(); i++)
		{
			if (Start.films.get(i).getTitle().contains(s))
			{
				System.out.printf("-- Title: %s || Region: %s --\n",
						Start.films.get(i).getTitle(), Start.films.get(i).getRegion());
			}
		}
	}
	
	public static ArrayList<FilmTitle> readFile(String filename) throws FileNotFoundException 
	{	
		ArrayList<FilmTitle> tempList = new ArrayList<>();
		File csvFile = new File(filename);
		Scanner csvScan = new Scanner(csvFile);
		while (csvScan.hasNextLine())
		{
			String line = csvScan.nextLine();
			FilmTitle film = new FilmTitle(line); //creating new instance of object
			tempList.add(film); //adding current film to the temporary array list
		}
		csvScan.close();
		return tempList;
	}

	public String filmToString() 
	{
		return "FilmTitle [titleId=" + titleId + ", ordering=" + ordering + ", title=" + title + ", region=" + region
				+ ", language=" + language + ", type=" + type + ", attributes=" + attributes + ", isOriginalTitle="
				+ isOriginalTitle + "]";
	}
	
	public String getRegion() //getter
	{
		return this.region;
	}
	public String getTitleId()
	{
		return this.titleId;
	}
	public String getTitle()
	{
		return this.title;
	}
}