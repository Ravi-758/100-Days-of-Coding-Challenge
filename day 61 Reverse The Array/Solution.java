import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    static int helper(int l, int r,ArrayList<Integer> arr){       
        if(l>=r) return 1;
       Collections.swap(arr, l, r);
        return helper(l+1,r-1,arr);  
        }    
                        
public static void reverseArray(ArrayList<Integer> arr, int m){ 
       helper(m+1,arr.size()-1,arr);    
              }                 
}
