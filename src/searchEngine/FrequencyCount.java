package searchEngine;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyCount {
			
		public static void main(String[] args) throws IOException{
			
			 HashMap <String,Integer> hm = new HashMap<String,Integer>();
			 BufferedReader br = null;
			 try {
				 
				 br =  new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\searchEngine-main\\convertedWebPages\\Food Guide Canada.txt"));
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
				String repeated = null;
				int count= 0;
				Set<Entry<String,Integer>> entrySet = hm.entrySet();
				for(Entry<String,Integer> entry:entrySet) {
					if(entry.getValue()>count) {
						repeated=entry.getKey();
						count=entry.getValue();
					}
				}
				
				System.out.println("The word repeated for most number times is "+ repeated);
				System.out.println("The frequency of the occured word is "+ count);
				
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	     finally {
	    	 br.close();
	     }
			 
	  }

 }
