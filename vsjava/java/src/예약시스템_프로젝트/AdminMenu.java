package 예약시스템_프로젝트;

import java.io.IOException;
import java.util.ArrayList;

public class AdminMenu extends AbstractMenu {

    private static final AdminMenu instance = new AdminMenu(null);
    private static final String ADMIN_MENU_TEXT = // 기본 문구
            "1: 버스 등록하기\n" +
            "2: 버스 목록 보기\n" +
            "3: 버스 삭제하기\n" +
            "b: 메인 메뉴로 이동\n\n" +
            "메뉴를 선택하세요: ";

    public AdminMenu(Menu prevMenu) {
        super(ADMIN_MENU_TEXT, prevMenu); // 부모생성자 호출
    }

    public static AdminMenu getInstance() {
        return instance;
    }

    @Override
    public Menu next() {
        switch (scanner.nextLine()) {
            case "1":
                createbus(); // 버스 등록진행
                return this; // 관리자 메뉴 객체 반환
            case "2":
                printAllbuses(); // 버스 목록 출력
                return this; // 관리자 메뉴 객체 반환
            case "3":
                deletebus(); // 버스 삭제 진행
                return this; // 관리자 메뉴 객체 반환
            case "b":
                return prevMenu; // b입력시,이전메뉴를 반환
            default:
                return this;
        }
    }

    // ================ 각 케이스 메소드 ================
    private void deletebus() {
        printAllbuses(); // 모든 버스를 출력
        System.out.println("삭제할 버스를 선택하세요 : ");
        try{
            Bus.delete(scanner.nextLine());
        }catch(IOException e) {
            System.out.println(">>삭제 실패");
        }
    }

    // 모든 버스를 출력
    private void printAllbuses() {
        try {
            ArrayList<Bus> buses = Bus.findAll();
            System.out.println();
            // for(bus bus : buses) {
            // System.out.println("\n" + bus);
            // }
            for (int i = 0; i < buses.size(); i++) {
                System.out.printf("%s\n", buses.get(i).toString());
            }
        } catch (IOException e) {
            System.out.println("데이터 접근에 실패"); // 예외처리
        }
    }

    private void createbus() {
        System.out.print("버스 : ");
        String name = scanner.nextLine();
        System.out.print("행선지 : ");
        String arrive = scanner.nextLine();
        Bus bus = new Bus(name, arrive); // 버스아이디는 자동생성
        try {
            bus.save();
        } catch (IOException e) {
            System.out.println(">> 실패하였습니다.");
        }

    }
}