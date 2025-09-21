package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+"개의 정수를 입력하세요:");
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(j<n-1){
                System.out.print(num[j]+", ");
            } else{
                System.out.print(num[j]);
            }

        }
    }
}
