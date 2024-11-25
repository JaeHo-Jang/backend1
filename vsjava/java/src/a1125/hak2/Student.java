package a1125.hak2;

import a1118.replace1;

public class Student {
    // getter, setter, 생성자를 활용한 연습 문제
    // 문제 1: 학생 클래스 만들기
    // 문제 설명:

    // 학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
    // 각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록
    // 하세요.
    // 생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.

    private String name;
    private int studentId;
    private int kor, math, eng;

    public Student(){

    };   // 밑에 이미 생성자가 있으므로 Main2문의 student2 기본 생성자를 만들어 주기 위해
    // 공백으로 빈칸 기본생성자를 만들어줘야 함.

    // 생성자 - 초기값을 쉽게 대입하기 위해 만든다.
    public Student(String name, int studentId, int kor, int math, int eng) {
        this.name = name;
        this.studentId = studentId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }



    public double getAverage() {
        // double result = (kor + math + eng) / 3.0;   // 이 선언 후 리턴으로 보내주는것이 정석이다. -> 하지만 짧게!
        // return result;   // 아래처럼 해도 되용

        return (kor + math + eng) / 3.0;
    }
}
