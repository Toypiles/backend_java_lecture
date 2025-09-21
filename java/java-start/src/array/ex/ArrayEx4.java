package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] num=new int[5];
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
