package a1115;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        // 변수 선언 : 메뉴 번호, 메뉴 이름
        int menuNo =0;
        String MenuName = "";
        Scanner sc = new Scanner(System.in);
        // do ~ while문
        // : 무조건 1회는 실행 후 , 조건을 검사하여 반복하는 문장
        do {
            System.out.println("#### 점심 메뉴판 ####");
            System.out.println("1. 서브웨이(에그마요)");
            System.out.println("2. 신라면");
            System.out.println("3. 삼양라면 & 주먹밥");
            System.out.println("4. 라밥");
            System.out.println("5. 잔치국수");
            System.out.println("6. 맥도날드");
            System.out.println("7. 아비꼬 카레");
            System.out.println("8. 사보텐");
            System.out.println("9. 제주흑돼지 돈까스");
            System.out.println("10. 페이페이(나시고랭)");
            System.out.print("메뉴번호 : ");

            menuNo = sc.nextInt();

            switch(menuNo) {
                case 1: MenuName = "서브웨이(에그마요)"; break;
                case 2: MenuName = "신라면"; break;
                case 3: MenuName = "삼양라면 & 주먹밥"; break;
                case 4: MenuName = "라밥"; break;
                case 5: MenuName = "잔치국수"; break;
                case 6: MenuName = "맥도날드"; break;
                case 7: MenuName = "아비꼬 카레"; break;
                case 8: MenuName = "사보텐"; break;
                case 9: MenuName = "제주흑돼지 돈까스"; break;
                case 10: MenuName = "페이페이(나시고랭)"; break;
                default: MenuName = "(굶음)"; break;
                
            }

            //메뉴번호 유효성 검사
            if(menuNo !=0 && menuNo <=10) {
                System.out.println(MenuName + "(을/를) 먹었습니다.");
            }else if(menuNo !=0) {
                System.out.println(MenuName);
            }

        }while(menuNo != 0);
        //무한루프 : 조건이 항상 true가 되는 경우 반복이 계속되는 상황
        // - 반드시, 반복문 안에 종료조건을
        System.out.println("메뉴판을 종료합니다.");
        sc.close();
    }
}
