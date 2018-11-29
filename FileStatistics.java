import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics {
	
	public static void main(String[] args) {
		
		String f = "text.txt";
		//System.out.println(f.getName());
		
		Path filePath = Paths.get("text.txt");
		
		try 
		{
			//method readAttributes() - returns an instance of BasicAttributes class
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("File "+ f);
			System.out.println("File is in the same directory? "+ attr.isDirectory());
			System.out.println("Creation time " + attr.creationTime());
			System.out.println("Last modified time " + attr.lastModifiedTime());
			System.out.println("Size "+ attr.size());
			
		}
		
		catch(IOException e)
		{
			System.out.println ("IO Exception");
		}
		
	}
	
}