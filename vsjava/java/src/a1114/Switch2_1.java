package a1114;

public class Switch2_1 {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A', 'a' -> { // 브레이크없이 케이스문 두개 없이 이렇게 쓸수도 있음 12버전 이상부터 가능 --> 이런걸 표현식이라고 함
                System.out.println("우수회원");
            }
            case 'B', 'b' -> {
                System.out.println("일반회원");
            }
            default -> {
                System.out.println("손님");
            }
        }
    }
}
