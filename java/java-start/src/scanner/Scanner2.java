package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1");
        int num1=sc.nextInt();
        System.out.println("2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
