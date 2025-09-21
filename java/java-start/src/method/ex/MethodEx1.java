package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        double av =avg(1,2,3);
        System.out.println(av);
        double av1 =avg(15,25,35);
        System.out.println(av1);
    }

    public static double avg(int a, int b, int c){
        int sum=a+b+c;
        double avg=(double) sum/3;
        return avg;
    }
}
