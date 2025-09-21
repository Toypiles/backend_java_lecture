package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        loop("hello world", 3);
    }

    public static void loop(String message, int n){
        for(int i=0;i<n;i++){
            System.out.println(message);
        }
    }
}
