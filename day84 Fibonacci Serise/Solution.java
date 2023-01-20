import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int number = sc.nextInt();
        int firstTerm =0;
        int secondTerm=1;
        for(int i=1;i<=number;i++){
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
