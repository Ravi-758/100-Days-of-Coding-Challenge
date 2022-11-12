import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
           
        //Write your code here
        boolean matchFound = false;
        Pattern pattern = Pattern.compile("<([\\w\\W]+)>([^<>]+)<\\/(\\1)>");
        Matcher matcher = pattern.matcher(line);
        while(matcher.find()){
            System.out.println(matcher.group(2));
            matchFound = true;
        }

        if(!matchFound)
            System.out.println("None");
        testCases--;
    }
} 
            
}
