package a1129;

abstract class Animal {
    int a = 10;
    abstract void cry();
    // 추상클래스는 추상 메소드를 포함하고 있다는 점을 제외하면, 일반 클래스와 동일
    // 즉 생성자와 필드, 일반 메소드 포함가능
}
class Cat extends Animal {

    @Override
    void cry() {
      System.out.println("냐옹! 냐옹!");        
    }
}

class Dog extends Animal {

    @Override
    void cry() {
    System.out.println("왈 왈왈와로아와와와왈");
    }

}


public class Ab1 {
    public static void main(String[] args) {
        //  Animal a = new Animal();     ===> 이거안되 -> 추상클래스는 인스턴스(객체)생성 불가(금지)
        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();

        Animal e = new Cat();
        Animal f = new Dog();
        e.cry();  // 자식을 부모 타입으로 업 캐스팅 후 cry메소드 호출(다운캐스팅 안해도됨)
        f.cry();  // 다형성
    }
    
}
