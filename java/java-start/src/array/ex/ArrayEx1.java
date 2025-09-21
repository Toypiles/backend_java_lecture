package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students={90,80,70,60,50};
        int total=0;
        int count=0;
        for(int i=0; i<students.length; i++){
            total+=students[i];
            count++;
        }
        double avg=(double)total/count;
        System.out.println(total);
        System.out.println(avg);
    }
}
