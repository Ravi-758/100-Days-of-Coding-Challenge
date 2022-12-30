import java.util.Scanner;
import java.util.Arrays;
class Main{
    static void bubbleSort(int arr[]){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
             if(arr[j]<arr[j+1]){
                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1] =temp;
             }   
            }
        }
    }
    
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the number you want to enter:-");
       int size= sc.nextInt();
       System.out.println("enter the array:-");
       int arr[]  = new int[size];
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }
        Main.bubbleSort(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
