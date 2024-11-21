package a1121.class2;

public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        // 객체를 만들고


        // 객체를 접근할려면 변수.~~
        p1.name = "홍길동";
        p1.age = 30;
        p1.gender = "남성";

        System.out.println();

        System.out.println("이름 : " + p1.name);
        System.out.println("이름 : " + p1.age);
        System.out.println("이름 : " + p1.gender);



        Person p2 = new Person("김미리", 52, "여성");
        
        System.out.println("이름 : " + p2.name);
        System.out.println("이름 : " + p2.age);
        System.out.println("이름 : " + p2.gender);

    }
}
