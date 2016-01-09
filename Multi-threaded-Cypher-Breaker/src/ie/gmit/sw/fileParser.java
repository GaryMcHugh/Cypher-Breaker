package ie.gmit.sw;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.io.*;

public class fileParser {
	
	public Map<String, Double> parse(String File) throws IOException{
		Map<String,Double> temp = new ConcurrentHashMap<String, Double>();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("4grams.txt")));
		
		String next=null;
		
		while((next=br.readLine()) != null){
			//add each 4gram to the hash map
		}
		return null;
	}

}
