package a1206.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        // 더미 데이터 추가
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
        users.add(new User(3L, "Charlie"));
    }

    public Optional<User> findById(long id) {
        // 대표예시
        // for(User user : users) { // users라는 리스트를 돌면서
        // if(user.getId().equals(id)) { // id가 같은 유저를 찾으면
        // return Optional.of(user); // Optional에 담아 반환하고
        // }
        // }
        // return Optional.empty(); // 그렇지 않으면(id같은게 없으면) 빈 Optional
        // 대표예시

        // Stream 1
        Optional<User> user1 = users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
        return user1;

        // // Stream 2  ===== 1을 줄일 수 있음. (위 선언 public같은 사유에서만)
        // return users.stream()
        //         .filter(user -> user.getId().equals(id))
        //         .findFirst();
        // // Stream

    }

}
