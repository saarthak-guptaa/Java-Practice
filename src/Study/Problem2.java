import java.util.Scanner;

public class Problem2 {
    public static void findingBiggestNo(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("The biggest number is "+a);
        }
        else if(b>c){
            System.out.println("The biggest number is "+b);
        }
        else{
            System.out.println("The biggest number is "+c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        findingBiggestNo(a,b,c);
        sc.close();
    }
}
