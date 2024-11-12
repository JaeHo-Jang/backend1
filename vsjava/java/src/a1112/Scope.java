package a1112;

public class Scope {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = 0;
        if(v1 > 10) {
            v2 = v1 - 10;
        }    // 블럭스코프는 블럭 내에서만 유효하기 때문에 위에 초기화값을 넣어줘야만 쓸 수 있음.
        int v3 = v1 + v2 + 5;  
        // 교재 68p 참고.
    }
}
