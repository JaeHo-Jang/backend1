package a1129.arraylist2;
//컬렉션 프레임 워크

import java.util.ArrayList;
// 알트 + 쉬프트 + o(영어)를 입력하여 추가
import java.util.Collections;
import java.util.Iterator;

// List 인터페이스
// 1. 요소의 저장순서 유지
// 2. 같은 요소 중복저장 허용

//Set 인터페이스

//Map 인터페이스

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // 알트 + 쉬프트 + o(영어)를 입력하여 추가
        //add메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        // System.out.println("리스트출력 1 : " + arrList);  // 별로 좋은 방법은 아닌데 확인하고자 할때만 써라.

        // for문과 get()메소드를 이용한 요소의 출력
        for(int i=0; i < arrList.size();i++) {
            System.out.println(arrList.get(i) + " ");
        }

        //Enhance for문 - foreach문과 get 메소드를 이용한 요소의 출력
        for(int e : arrList) {
            System.out.print(e + " ");
        }


        System.out.println();
        //Collections.sort메소드를 이용한 요소의 정렬
        Collections.sort(arrList);
        for(int e : arrList) {
            System.out.print(e + " ");
        }


        //iterator() 메소드와 get() 메소드를 이요한 요소 출력
        // 다양한 요소에 접근 List Map Set
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            //다음요소가 있을때까지 순회
            System.out.print(iter.next() + " ");
            //next 현재요소 반환, 다음요소로 이동
        }
        System.out.println();

        //set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);
        for(int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();

        //요소의 삽입
        arrList.add(1, 50);
        for(int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("리스트의 크기 : " + arrList.size());
        System.out.println();


        arrList.remove(3);
        for(int e : arrList) {
            System.out.print(e + " ");
        }


    }
}
