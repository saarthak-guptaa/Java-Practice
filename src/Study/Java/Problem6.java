package Study.Java;

import java.util.Scanner;

public class Problem6 {
    public static void palindrome(String pal){
        int len=pal.length();
        pal = pal.toLowerCase();
        for(int i=0; i<(len/2); i++){
            if(pal.charAt(i)!=pal.charAt(len-i-1)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("The word is a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        palindrome(str);
        sc.close();

    }
}
