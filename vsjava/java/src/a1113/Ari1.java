package a1113;

public class Ari1 {
    public static void main(String[] args) {
        System.out.println();
        byte v1 = 10;
        byte v2 = 4;
        int V3 = 5;
        long v4 = 4L;

        int result1 = v1 + v2; //모든연산자는 int 타입으로 자동 변환후 연산
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4; 	//모든 피연산자는 long 타입으로 자동 변환 후 연산
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2;	//double 타입으로 강제 변환 후 연산
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;    // % = 나눈 나머지
		System.out.println("result4: " + result4);



    }
}
