import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num= sc.nextInt();
        int r,sum=0,temp;
        temp = num;
        while(num>0){
            r = num%10;
            sum = (sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Palindrom Number");
        }
        else{
            System.out.println("Not palindrom Number");
        }
    }
}
