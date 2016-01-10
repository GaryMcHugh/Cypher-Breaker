package ie.gmit.sw;

import java.io.IOException;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in);
		
		String cypherText;
		int key;
		
		Map<String, Double> cypherMap;
		
	    System.out.print("Enter the Railfence Key: ");
	    key = console.nextInt();
		   
	    console.nextLine();
	    
	    System.out.print("Enter the Cypher text: ");
	    cypherText = console.nextLine();
	    
	    //I used a key of 3 and cypher message HYSAPDYPA
	    System.out.println();
	    System.out.println("Your key is: " + key);
	    System.out.println("Your message is: " + cypherText);
	    
	    //create instances of failFence and fileParser
		RailFence railF = new RailFence();
		
		FileParser fileP = new FileParser();
	    
		
		//parse 4grams
		cypherMap = fileP.parse("4grams.txt");
	}

}
