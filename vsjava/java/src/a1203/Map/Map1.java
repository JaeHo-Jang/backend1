package a1203.Map;

import java.util.HashMap;
import java.util.Iterator;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // 삽입을 put()을 씀
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());  // 출력 시 순서보장이 안됨.
        for(String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        };
        // 키 - 값 쌍으로 데이터 저장.
        // 각 데이터는 고유한 키(key)와 이에 대응하는 값(value)으로 구성
        // 순서없음, 중복허용, null 허용, 동기화 되지 않음, 시간의 복잡도 평균

        System.out.println();
        //remove() 메소드를 이용한 요소의 제거
        
        hm.remove("사십");
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }

        System.out.println();

        //replace() 메소드를 이용한 요소의 수정
        hm.replace("이십", 200);

        for(String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        };

        System.out.println();

        //size()메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + hm.size());
    }
}
