package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n=sc.nextInt();
        System.out.println(n+"개의 정수를 입력하세요:");
        int[] num=new int[n];
        int sum=0;
        for(int i=0; i<num.length;i++){
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        double avg=(double)sum/num.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
