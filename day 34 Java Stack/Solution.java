import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.next();
            Stack<Character>st= new Stack<>();
            char[] s = str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(st.isEmpty()){
                    st.push(s[i]);
                    continue;
                }
                else if(s[i]=='}'){
                    if(st.peek()=='{')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else if(s[i]==']'){
                    if(st.peek()=='[')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else if(s[i]==')'){
                    if(st.peek()=='(')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else{
                    st.push(s[i]);
                }
            }
            System.out.println(st.isEmpty());
            // scanner.nextLine();

        }
    }
}
