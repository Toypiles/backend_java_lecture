package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n=sc.nextInt();
        System.out.println(n+"개의 정수를 입력하세요:");
        int[] num=new int[n];
        int max;
        int min;
        for(int i=0; i<num.length;i++){
            num[i]=sc.nextInt();

        }
        max=min=num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
