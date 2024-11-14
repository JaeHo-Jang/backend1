package a1114;

public class Bitshift {
    public static void main(String[] args) {
        System.out.println();
        int num1 =1;
        int result1 = num1 << 3;  // 좌로 3칸 이동
        int result2 = num1 * (int) Math.pow(2,3);   // 2의 3승이라는 뜻.
        System.out.println("result1 : "+ result1);
        System.out.println("result2 : "+ result2);
    }
}
