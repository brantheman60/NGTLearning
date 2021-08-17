package ngtlearning;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * JSoup will organize and filter websites
 * 
 * Challenge: enhance your code and ask user for the following:
 * 	Enter the website URL they want to search keywords in.
 * 	Enter the list of keywords to search for in the website.
 */

public class WebCrawler {

	final String keywordDataFile = "keyworddata.txt";
	String[] keywords = {"PE", "Java", "Basketball"};
	File keywordFile;
	
	final String dataFile = "data.txt";
	File file;
	final String site = "http://www.dvhigh.net/";
	
	public static void main(String[] args) throws IOException{
		WebCrawler myCrawler = new WebCrawler();
		try
		{
			myCrawler.file = new File(myCrawler.dataFile);
			myCrawler.file.createNewFile();
			
			myCrawler.keywordFile = new File(myCrawler.keywordDataFile);
			myCrawler.keywordFile.createNewFile();
			myCrawler.processPage(myCrawler.site);
		}
		catch (FileNotFoundException fnfe)
		{
			myCrawler.file.createNewFile();
		}
		finally
		{
			myCrawler.file.delete();
		}

	}

	public boolean writeToFile(String URL) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader(file));
		String line;
		
		while((line = reader.readLine()) != null){
			if (line.trim().contains(URL)) {
				reader.close();
				return true;
			}
		}
		reader.close();
		
		//If URL not found then add it to the file
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		System.out.println("----->> Writing the URL to the file "+URL);
		writer.append(URL);
		writer.newLine();
		writer.close();
		return false;
	}
	
	public void processPage(String URL) throws IOException {
		//Filter out invalid links...
		if(URL.contains(".pdf") || URL.contains("@")
				|| URL.contains(":80") || URL.contains(".jpg")
				|| URL.contains("&return_url") || URL.contains("?"))
			return;
		
		//Only process if it is an internal link
		if(URL.contains("www.dvhigh.net") && URL.endsWith("/")){
			URL = URL.substring(0, URL.length()-1);
		} else if (! URL.contains("www.dvhigh.net")){
			return;
		}
		boolean urlExists = writeToFile(URL.trim());
		//check if URL already exists in the list
		if (!urlExists)
		{
			Document doc = null;
			try {
				doc = Jsoup.connect(URL).get();
			} catch (IOException e1){
				e1.printStackTrace();
				return;
			}
			for (int i=0; i<keywords.length; i++)
			{
				if (doc.text().contains(keywords[i])) {
					System.out.println("Found keyword "+keywords[i] +" "+URL);
					writeKeywordToFile(URL, keywords[i]);
				}
			}
			Elements questions = doc.select("a[href]");
			for (Element link : questions) {
				String followURL = link.attr("abs:href");
				processPage(followURL);
			}
		}
	}
	
	public void writeKeywordToFile(String URL, String keyword) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(keywordFile));
		String line;
		
		while((line = reader.readLine()) != null){
			if (line.trim().contains(URL) && line.trim().contains(keyword)){
				reader.close();
				return;
			}
		}
		reader.close();
		//If Keyword or URL not found then add it to the file
		FileWriter fileWriter = new FileWriter(keywordFile, true);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		//Add URL and Keyword as ; separated item.
		line = URL +";" + keyword;
		System.out.println(">> Writing the keyword to the file "+line);
		writer.append(line);
		writer.newLine();
		writer.close();
		return;
	}
}
