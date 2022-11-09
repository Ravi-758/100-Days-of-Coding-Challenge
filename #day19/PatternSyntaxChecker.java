import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int testCases = Integer.parseInt(inp.nextLine());
		while(testCases>0){
			// String pattern = inp.nextLine();
          	//Write your code
               try{
        String pattern = inp.nextLine();
            Pattern.compile(pattern);
            System.out.println("Valid");
        }catch(Exception e){
            System.out.println("Invalid");
        }
        testCases--;
    }
}

	
}
