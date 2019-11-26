import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilmTitle 
{
	public String comma = ",";
	public String titleId;
	public String ordering;
	public String title;
	public String region;
	public String language;
	public String isOriginalTitle;
	
	public FilmTitle(String csvString)
	{
		String[] csvParts = lineSplit(csvString, comma);
		int index = 0;
		titleId = csvParts[index++];
		ordering = csvParts[index++];
		title = csvParts[index++];
		region = csvParts[index++];
		langu
	}
	
	public String[] lineSplit(String csvString, String s) //spits line using input as delimiter
	{
		int index = 0;
		int qouteCount = 0;
		String[] parts = new String[8];
		Arrays.fill(parts, "");
		
		for(int i = 0; i < csvString.length(); i++)
		{
			if(csvString.charAt(i) != ',') {
				parts[index] += csvString.charAt(i);
			}
			if(csvString.charAt(i) == '"')
			{
				qouteCount++;
			}
			if(csvString.charAt(i) == ',' && qouteCount%2 == 0)
				index++;
			if(csvString.charAt(i) == ',' && qouteCount%2 == 1)
				parts[index] += csvString.charAt(i);
		}
		return parts;
	}
	
	public void readFilmTitles()
	{}
	public void searchFilms()
	{}
	public void listRegions() /* list all regions for every film */
	{}
	public void getFilmTitlesUsingRegion(String r) /* uses region as input, outputs films in that region */
	{}
	public void searchFilms(String s) /* uses user String input, outputs film titles that contains the user's input */
	{}
	
	public static ArrayList<FilmTitle> readFile(String filename) throws FileNotFoundException {
		ArrayList<FilmTitle> films = new ArrayList<>();
		File csvFile = new File(filename);
		Scanner csvScan = new Scanner(csvFile);
		csvScan.nextLine(); // read header
		while (csvScan.hasNextLine()) 
		{
			String line = csvScan.nextLine();
			FilmTitle film = new FilmTitle(line);
			films.add(film);
		}
		csvScan.close();
		return films;
	}
}