package a1126.sec06.package2;

import a1126.sec06.package1.A;
//임포트만 되면 protected는 호출이 간으하다.

public class D extends A {
    // 생성자 선언
    public D() {
        // A()생성자 호출 가능.
        super();
    }
    public void method1 () {
        // A 필드값 변경
        this.field = "value";  //
        this.method();  // A에 있는 메소드를 호출.
    }  
    public void method2 () {
        // A a = new A();   = X 안됨.
        // a.field = "value";   = X 안됨.
        // a.method();    = X 안됨.
    }
}
