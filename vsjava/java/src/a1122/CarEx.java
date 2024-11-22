package a1122;

class Car {
    String brand;
    String model;

    Car () {
        this("unknwon", "Unknown");  // 다른 생성자 호출
    }
    Car(String brand) {
        this(brand, "Unknown");
    }
    // Car(String model) {
    //     this("Unknown", model);
    // }
    

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void display () {
        System.out.println("Brand : " + brand + ",Model : " + model);
    }
}

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Civic");
        Car car4 = new Car("", "GV70");
        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}

//this  현재 객체 자신을 참조
//this() 현재클래스의 다른 생성자 호출