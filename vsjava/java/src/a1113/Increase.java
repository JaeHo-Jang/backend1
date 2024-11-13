package a1113;

public class Increase {
    public static void main(String[] args) {
        System.out.println();
        int x = 10;
        int y = 10;
        int z;

        x++;    // x+1
        ++x;    // x+1
        System.out.println("x = " + x);

        y--;
        --y;
        System.out.println("y = " + y);

        z = x++;   //  z = x,     x = x+1 임  (연산 순위에 의해서임)     z :12  / x :13
        // x++이 아닌 ++x가 되면 ++이 연산순위 위로 올라와서 z = x+1,   x = x+1이 됨   z :13   / x :13
        System.out.println("z = " + z);
        System.out.println("x = " + x);


        z = ++x;    // 14로 증가된 내용을 z에 저장
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
