package ie.gmit.sw;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.io.*;

public class FileParser {
	
	public Map<String, Double> parse(String File) throws IOException{
		Map<String,Double> temp = new ConcurrentHashMap<String, Double>();
		
		String splitString = "";
		String key;
		Double text;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("4grams.txt")));
		
		String next=null;
		
		while((next=br.readLine()) != null){
			//add each 4gram to the hash map
			
			// split on the space
			String[] parseArray = splitString.split(" ");
			
			//key is first value in 4grams
			key = parseArray[0];
			
			//text is second value in 4grams
			text = Double.parseDouble(parseArray[1]);
					
			// add values to hashMap
			temp.put(key,  text);
		}
		return null;
	}

}
