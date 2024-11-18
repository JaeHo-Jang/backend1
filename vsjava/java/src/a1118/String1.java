package a1118;

public class String1 {
    public static void main(String[] args) {
        //String은 참조타입
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");

        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a.equals(d));

        System.out.println(e == f);
        System.out.println(e.equals(f));
        System.out.println(b.equals(e));

        //        == : 해당 변수의 래퍼런스(참조 정보를 비교)
        //        equals() : 해당변수의 문자열 자체를 비교
        
    }
}
