package Project2_이슬;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Menu menu = ProgramMenu.getInstance();
        
        while (menu != null) {
            System.out.printf("\n\n-><--><-->< 안녕하세요 말꽃 시스템입니다. ><--><--><-");
            menu.showMenu();
            menu = menu.next();
        }

        System.out.println("\n\n-><--><-->< 말꽃 시스템을 종료합니다. ><--><--><-");
    }
}

interface Menu {
    void showMenu(); 
    Menu next() throws Exception;
}