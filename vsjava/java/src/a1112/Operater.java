package a1112;

public class Operater {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        // byte result = a + b;   // 연산시에는 큰값으로 바꿔줘야 함 -> 웬만하면 byte타입은 쓰지말 것.
        int result = a + b;
        System.out.println(result);

        byte result1 = 10 + 20 ;
        System.out.println("result1 : " + result1);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;    // long타입으로 변환 후 연산
        System.out.println("result3 : " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char)result4);   // 66을 아스키 코드로 바꾸면 B

        int v8 = 10;
        int result5 = v8 / 4;  // 정수 연산의 결과는 정수 -> 4.0으로 하면 오류남.
        System.out.println("result5 : " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;  // double타입으로 변환 후 연산
        System.out.println("result6 : " + result6);

        int v10 = 10;
        int v11 = 2;
        double result7 = v10 / v11;
        System.out.println(result7);

        int v12 = 1;
        int v13 = 2;
        double result8 = (double)v12 / v13;  // double을 안붙히면 0.0이 나옴.
        System.out.println(result8);
    }
    
}
