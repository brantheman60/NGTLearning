package ngtlearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	StringBuffer getPageContent (String pageUrl)
	{
		StringBuffer pageContent = new StringBuffer();
		try
		{
			URL url = new URL(pageUrl);
			URLConnection urlCon = url.openConnection();
			InputStreamReader inReader = new InputStreamReader(urlCon.getInputStream());
			BufferedReader buffReader = new BufferedReader(inReader);
			String line;
			while((line = buffReader.readLine()) != null){
				pageContent.append(line + "\n");
			}
			return pageContent;
		} catch (Exception e) {return null;}
	}
	public static void main(String[] args) {
		URLReader urlReader = new URLReader();
		StringBuffer page = urlReader.getPageContent("http://www.google.com");
		System.out.println(page);

	}

}
