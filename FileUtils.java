import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *	File Utilities for reading and writing
 *	
 *	@author	Branden Chuu
 *	@since August 24, 2023
 */
 public class FileUtils
 {
	 /**
	  * Opens a file to read using the Scanner class
	  * @param fileName name of file to open
	  * @return 		the scanner object to the file
	  */
	  public static java.util.Scanner openToRead(String FileName)
	  {
		  java.util.Scanner input = null;
		  try 
		  {
			input = new java.util.Scanner(new File (FileName));
		  }
		  catch (java.io.FileNotFoundException e)
		  {
			  System.err.println("ERROR Cannot open " +FileName + " for reading");
			  System.exit(-1);
		  }
		  return input;
	  }
	  /**
	   * Opens a fuile to write using the PrintWriter class
	   * @param fileName   name of the file to open
	   * @return		   the PrintWriter object to the file
	   */
	   public static PrintWriter openToWrite(String fileName)
	   {
		   PrintWriter output = null;
		   try
		   {
			   output = new PrintWriter (new File (fileName));
		   }
		   catch (FileNotFoundException e)
		   {
			   System.err.println("ERROR: Cannot open " + fileName + " for writing");
			   System.exit(-1);
		   }
		   return output;
	   }
		   
 }