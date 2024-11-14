package a1114;

public class infinityNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y ;
        // double z = x / y ; 이런건 잘못된 코드임
        // double z = x % y ; 이런건 잘못된 코드임.
        // System.out.println(z+2); 잘못된 코드

        //알맞은 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출불가");
        }else {
            System.out.println(z+2);
        }
    }
}
