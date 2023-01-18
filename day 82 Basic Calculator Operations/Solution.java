import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :-");
        int a = sc.nextInt();
        System.out.println("enter the opertaion you want to perfomr:-");
        char opertion = sc.next().charAt(0);
        System.out.println("enter the second number:-");
        int b = sc.nextInt();
        switch(opertion){
            case '+':
                System.out.println("the sum is :-"+(a+b));
                break;
            case '-':
                System.out.println("the minus is:-"+(a-b));
                break;
            case '*':
                System.out.println("the multiplie is:-"+(a*b));
                break;
            case '/':
                System.out.println("the divide is :-"+(a/b));
                break;
                
                default:
                System.out.println("enter a valid opertion");
        }
    }
}
