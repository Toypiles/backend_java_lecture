package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 ="문자열1";
        String str2 ="문자열2";

        boolean reseult1= "hello".equals("hello");
        boolean reseult2= str1.equals("문자열1");
        boolean reseult3= str1.equals(str2);

        System.out.println(reseult1);
        System.out.println(reseult2);
        System.out.println(reseult3);
    }
}
