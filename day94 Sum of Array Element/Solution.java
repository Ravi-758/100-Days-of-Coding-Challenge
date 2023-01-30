import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:-");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the array element:-");
        for(int i=0;i<a;i++){
            arr[i] =sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<=a-1;j++){
            sum = sum+arr[j];
        }
        System.out.println("Enter the sum of array Element is:-"+sum);
    }
}
