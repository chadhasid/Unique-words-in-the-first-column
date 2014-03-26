package project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filee {
// TODO Auto-generated method stub

public static void main(String[] args) throws IOException {

	        String scan;
	        FileReader file = new FileReader("/Users/Siddharth/Desktop/googlebooks-eng-all-1gram-20120701-a");
	        BufferedReader br = new BufferedReader(file);



while((scan = br.readLine()) != null)
              {
	String[] parts = scan.split(",");
	String part1 = parts[0];
	//String part2 = parts[1];
           System.out.println(part1);
                }
        br.close();    
              
	 
	        
}        
		
	}


