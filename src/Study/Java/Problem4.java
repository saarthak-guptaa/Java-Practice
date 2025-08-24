package Study.Java;

import java.util.Scanner;

public class Problem4 {
    public static void primeNo(int n){
        if(n<=1){
            System.out.println("Not prime number");
        }
        if(n==2){
            System.out.print("Prime number");
            return;
        }
         if(n%2==0){
            System.out.print("not a prime number");
            return;
        }
         for(int i=3;i<=Math.sqrt(n);i+=2){
             if(n%i==0){
                 System.out.print("not a prime number");
                 return;
                }
            }
         System.out.println("Prime number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        primeNo(n);
        sc.close();
    }
}
