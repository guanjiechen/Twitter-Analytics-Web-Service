package sort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class addtogether {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintWriter writer = new PrintWriter("/Users/Zhang/Desktop/addoutput", "UTF-8");
	    FileInputStream fis = new FileInputStream("/Users/Zhang/Desktop/addinput");
	    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	    String line;
	    long temp = 0;
	    while ((line = br.readLine()) != null) {
	       // process the line.
	    	String[] parts = line.split("\t");
	    	Long first = Long.parseLong(parts[0]);
	    	Long second = Long.parseLong(parts[1]);
	    	temp = temp + second;
//	    	System.out.println(temp);
	    	writer.println(first + "\t" + temp);
	    }
	    br.close();
	    writer.close();
	}
}
