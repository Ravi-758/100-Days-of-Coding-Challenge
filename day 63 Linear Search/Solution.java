import java.util.Scanner;
class linearSearch{
    public static int linearSearch(int arr[],int key){
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number of element you want to  enter:-");
       int n=sc.nextInt();
       int arr[] = new int[n];
       System.out.println("enter the element :--");
       for(int i =0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       System.out.println("enter the element you want to search:-");
       int key = sc.nextInt();
   
       int result =linearSearch(arr,key);
       if(result==-1)
       System.out.println("not found");
       else
       System.out.println("found:--"+result);
       
    }
}
