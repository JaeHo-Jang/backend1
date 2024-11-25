package a1125.Person1;

public class Person {
    private static int count;
    //   전체 사람 수를 저장하는 정적변수(클래스변수라고도 함).


    private String name;  // 변수, 필드, 인스턴트 변수라고 함.
    private int age;


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;   // 새로운 사람이 생성될때마다 총 인원수 증가
    }


    public static int getTotalCount() {
        return count;    // 애를 정적메소드라고 부름.
    }
}


//정적변수 (static 변수) - 클래스변수라고도 얘기한다.

// 정적변수는 클래스에 속하고, 객체를 생성하지 않고도
// 클래스 이름으로 직접 접근할 수 있는 변수 - 즉,
// 객체가 공유하는 하나의 값을 가집니다.