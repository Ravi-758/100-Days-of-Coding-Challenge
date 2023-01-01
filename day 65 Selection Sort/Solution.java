import java.util.Scanner;
import java.util.Arrays;
class selectionSort{
   void selectionSort(int arr[]) {
    int size = arr.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (arr[i] < arr[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = arr[step];
      arr[step] = arr[min_idx];
      arr[min_idx] = temp;
    }
  }
        
    
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the length of the array:-");
       int n = sc.nextInt();
       int arr[] =new int[n];
       System.out.println("enter the element of the array:-");
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       
    selectionSort ss = new selectionSort();
    ss.selectionSort(arr);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(arr));
       
    }
}
