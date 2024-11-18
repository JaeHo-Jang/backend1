package a1118;

public class SubString1 {
    public static void main(String[] args) {
        String ssn = "880815-1234567 ";
        String firstNum = ssn.substring(0,6);   // 6전까지 추출 = 880815
        System.out.println(firstNum);
        String secondNum = ssn.substring(7);   // 7번부터 끝까지 추출 = 1234567
		System.out.println(secondNum);		

    }
}
