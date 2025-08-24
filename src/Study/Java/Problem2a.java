package Study.Java;

import java.util.Scanner;

public class Problem2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        int biggestNo=Math.max(a,Math.max(b,c));
        System.out.println("The biggest number is "+biggestNo);
    }
}
