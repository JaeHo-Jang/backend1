package a1126.Hak5;

public class Student {

    //toString 메소드 오버라이드
    @Override
    public String toString() {
        return "이름 : "  + name + ", 학번" + studentId;
    }

    private String name;
    private String studentId;
    
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}
