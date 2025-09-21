package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+"개의 정수를 입력하세요:");
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력:");
        for(int i=n-1; i>=0;i--){
            System.out.print(num[i]);
            if(i>0){
                System.out.println(", ");
            }
        }
    }
}
