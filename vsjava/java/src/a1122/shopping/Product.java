package a1122.shopping;

public class Product {
    private String name;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { // 유효성 검사
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }

    // 생성자
    public Product(String name, double price, int stock) {
        this.name = name;
        // this.price = price; 음수 안되게 하는거 ↓ setPrice써라
        setPrice(price);
        // this.stock = stock;
        setStock(stock);
    }

    // ex자바의 toStr 매소드 생성
    public String toStr() {
        return String.format("제품명 : %s, 가격 : %.1f, 재고 : %d", name, price, stock);
        // ㄴ 문자 %s, 실수 %f, 정수(int) %d
    }

    public void addStock(int amount) {
        if (amount < 0) {
            System.out.println("재고 추가 실패 : 음수 값은 허용되지 않습니다.");
        } else {
            stock += amount;
            System.out.println(amount + "개의 재고가 추가되었습니다.");
        }
    }

    public void sellProduct(int amount) {
        if (amount > stock) { // 재고보다 판매수량이 많으면
            System.out.println("판매 실패 : 재고가 부족해요");
        } else if (amount <= 0) { // 판매수량이 음수일때
            System.out.println("판매 실패 : 판매 수량은 양수여야 합니다.");
        } else {
            stock -= amount;
            System.out.println(amount + "개의 상품이 판매되었습니다.");
        }
    }
}