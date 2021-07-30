package searchEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class mergeTextFiles {

	public static void mergeFiles() throws IOException {
		// TODO Auto-generated method stub

		// create instance of directory
        File dir = new File("D:\\Java Workspace\\SearchEngine\\convertedWebPages");
  
        // create obejct of PrintWriter for output file
        PrintWriter pw = new PrintWriter("D:\\Java Workspace\\SearchEngine\\output.txt");
  
        // Get list of all the files in form of String Array
        String[] fileNames = dir.list();
  
        // loop for reading the contents of all the files 
        // in the directory GeeksForGeeks
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);
  
            // create instance of file from Name of 
            // the file stored in string Array
            File f = new File(dir, fileName);
  
            // create object of BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fileName);
  
            // Read from current file
            String line = br.readLine();
            while (line != null) {
  
                // write to the output file
            	String[] arr = line.split(" ");    

            	for ( String ss : arr) {
            		//System.out.println(Arrays.toString(arr));
            		pw.println(ss);
            	}
                
                line = br.readLine();
            }
            pw.flush();
        }
	}

}
