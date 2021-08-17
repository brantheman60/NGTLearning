package ngtlearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *ask Mr. Singhani about internships?
 */
public class FileHandler {

	String student = null;
	File studentFile;
	
	public FileHandler(String stu) //a personal file for a student is created
	{
		student = stu.toLowerCase();
		try{
			studentFile = new File(student+".txt");
			if(!studentFile.exists())	{
				studentFile.createNewFile();
			}
		} catch (Exception e){}
	}
	
	boolean write(String name, String value) //subject grades are listed as:
											 //MATH=A+,PE=A+,ENGLISH=...
	{
		try{
			String writeString = name.toUpperCase()+"="+value.toUpperCase();
			
			String line = readline();
			if (line != null){ //for other times
				String[] strPairs = line.split(",");
				for (int i=0; i<strPairs.length; i++){
					String[] strValue = strPairs[i].split("=");
					if (! strValue[0].equals(name))
						writeString = writeString + "," + strPairs[i];
				}
			}
			//for 1st time
			FileWriter fileWriter = new FileWriter(studentFile, false);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write(writeString);
			writer.flush();
			writer.close();
			return true;
		}
		catch (Exception e) {return true;}
	}
	
	String read (String name) //when given a subject, the designed space for it appears!
	{
		String[] strPairs = null;
		String[] strValue = null;
		String line = readline();
		if (line == null)
			return null;
		strPairs = line.split(",");
		for (int i=0; i<strPairs.length;i++)
		{
			strValue = strPairs[i].split("=");
			if (strValue[0].equals(name.toUpperCase()))
				return strValue[1];
		}
		return null;
	}
	
	String readline()
	{
		try{
			String line = null;
			FileReader fileReader = new FileReader(studentFile);
			BufferedReader reader = new BufferedReader(fileReader);
			line = reader.readLine();
			reader.close();
			return line;
		} catch (Exception e) {return null;}
	}
	
	public static void main(String[] args) {
		FileHandler fh = new FileHandler("John_Fisher"); //an actual file is created here!
		System.out.println("Writing value...");
		fh.write("PE", "A+");
		fh.write("Math", "A");
		fh.write("Core", "B");
		System.out.println("Reading value..."+fh.read("PE"));
		System.out.println("Reading value..."+fh.read("Core"));
	}

}
