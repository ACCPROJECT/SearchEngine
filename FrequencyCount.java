package searchEngine;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyCount {
			
		public static void WordCount() throws IOException{
			
			 HashMap <String,Integer> hm = new HashMap<String,Integer>();
			 BufferedReader br = null;
			 try {
				 
				/* br =  new BufferedReader(new FileReader("D:\\Java Workspace\\SearchEngine\\convertedWebPages"));
				 String str = br.readLine();*/
				 Scanner sc= new Scanner(System.in);
				 File myFolder = new File("C:\\Users\\Dell\\Desktop\\searchEngine-main\\convertedWebPages");
				 File[] files = myFolder.listFiles();
				 System.out.println("Enter a word to search: ");
				 String userInput= sc.nextLine();
				 
				 for (File file : files) {
					br =  new BufferedReader(new FileReader(file));
					String str = br.readLine();
				 while(str!=null) {
					 String words[]= str.toLowerCase().split(" ");
					 for(String word:words) {
						 if(hm.containsKey(word)) {
							 hm.put(word,hm.get(word)+1);
							 
						 }
						 else {
							 hm.put(word,1);	 
						 }
					 }
					 str=br.readLine();
				 }
				 if(hm.containsKey(userInput))
					 System.out.println(userInput + " repeated " +hm.get(userInput)+" times in "+ file.getName());
				 else
					 System.out.println("Word not found in "+ file.getName());
				 }
				 
//				 if(hm.containsKey(userInput))
//					 System.out.println(userInput + " repeated " +hm.get(userInput)+" times.");
//				 else
//					 System.out.println("Word not found");
//				String repeated = null;
//				int count= 0;
//				Set<Entry<String,Integer>> entrySet = hm.entrySet();
//				for(Entry<String,Integer> entry:entrySet) {
//					if(entry.getValue()>count) {
//						repeated=entry.getKey();
//						count=entry.getValue();
//					}
//				}
				
//				System.out.println("The word repeated for most number times is "+ repeated);
//				System.out.println("The frequency of the occured word is "+ count);
				 
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	     finally {
	    	 br.close();
	     }
			 
	  }

 }
