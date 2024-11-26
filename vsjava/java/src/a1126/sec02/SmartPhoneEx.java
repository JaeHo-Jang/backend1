package a1126.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //SmartPhone 객체생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로 부터 상속 받은 필드 읽기
        System.out.println("모델: "+ myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
