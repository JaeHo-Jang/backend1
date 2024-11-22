package a1122.gettersetter;

public class CoffeeTest {
    public static void main(String[] args) {
        System.out.println();

        Coffee c = new Coffee("아메리카노", 3000);
        // 현재의 커피이름과 가격을 출력해 보세요.
        System.out.printf("%s(%d원) -> ", c.getName(), c.getPrice());

        // 가격을 500원 인상해 주세요.
        c.setPrice(c.getPrice() + 500);   // 500원 인상
        System.out.printf("인상된 가격 %s(%d원)\n ", c.getName(), c.getPrice());

        // set 변수의 내용을 정할 때(수정도 마찬가지), get은 만들어놓은 이름이나 가격을 불러올 때
    }
}

class Coffee {
    private String name;   // 직접 name 접근이 불가능
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {   // getter 값을 부를 때(사용할 때 )
        return name;
    }

    public void setName(String name) {   // setter  값을 정할 때
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
