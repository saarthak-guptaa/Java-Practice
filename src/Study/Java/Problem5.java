package Study.Java;

import java.util.Scanner;

public class Problem5 {
    public static void factorial(int n){
        long product=1;

        if(n<0){
            System.out.println("Enter a positive number");
            return;
        }
        for(int i=1;i<=n;i++){
            product*=i;
        }
        System.out.println(product);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
