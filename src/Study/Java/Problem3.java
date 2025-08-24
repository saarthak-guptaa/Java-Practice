package Study.Java;

import java.util.Scanner;

public class Problem3 {
    public static void reversingString(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        reversingString(str);
    }

}
