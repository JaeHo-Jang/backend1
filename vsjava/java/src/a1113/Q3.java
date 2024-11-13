package a1113;

public class Q3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <=100; i++) {
            // System.out.println(i);
            sum += i;    // sum = sum + i; 와 같음
            System.out.println("1부터 100 합계 : " + sum);
        }
    }
}
