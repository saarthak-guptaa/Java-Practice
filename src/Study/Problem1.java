import java.util.Scanner;

public class Problem1 {
    public static void oddOrEven(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("The number is negative");
        }
        oddOrEven(n);
        sc.close();
    }
}
