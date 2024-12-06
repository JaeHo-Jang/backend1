package a1206.optional;

import java.util.Optional;


// Optional은  null처리를 위한 도구
// null에 접근 했을 때 NullPointException로 오류가 터지고 아무것도 안됨
// Optional은 null이여도 오류가 나지 않음

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> optionalName = findName("Mark");
        // Optional<String> optionalName = findName("John");
        System.out.println(optionalName.orElse("Name not found"));   // 값이 없으면 기본값 반환
        //Optional 에는 orElse() 라는 메소드와 orElseGet() 이라는 메소드가 있는데요.
        // 둘 다 Optional 을 통해 가져온 값이 null 일 때는 해당 값을 반환하라는 메소드 입니다.
    }

    private static Optional<String> findName(String name) {
        if("John".equals(name)){
            return Optional.of(name);
        }
        return Optional.empty();
    }
}
