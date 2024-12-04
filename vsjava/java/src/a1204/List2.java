package a1204;

import java.util.ArrayList;
import java.util.List;

class Student {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

public class List2 {
    public static void main(String[] args) {
        // ArrayList 생성
        List<Student> studentList = new ArrayList<>();

        // 객체추가
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 22));
        studentList.add(new Student(103, "Charlie", 21));

        // ArrayList 내용출력
        System.out.println("Student List 출력 : ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // 특정인덱스의 객체 가져오기
        System.out.println("\n특정 인텍스(1)의 Student 정보");
        Student student = studentList.get(1); // 인덱스 1번객체
        // String name = studentList.get(1).getName(); 이름
        System.out.println(student);

        // 모든 student 이름만 출력
        System.out.println("\n모든 학생의 이름 출력");
        for (Student s : studentList) {
            System.out.println(s.getName());
        }

        // 데이터추가
        // 104, "David", 23
        System.out.println("\n새로운 학생 추가");
        studentList.add(new Student(104, "David", 23));
        printList(studentList);

        // 데이터 변경
        System.out.println("\n 특정 학생 변경");
        updateStudent(studentList, 102, "Robert", 25);

        // 데이터 삭제
        System.out.println("\n 특정 학생 삭제");
        deleteStudent(studentList, 103);

        // 데이터 검색
        System.out.println("\n 특정 학생 검색");
        Student serchedStudent = findStudentByID(studentList, 104);
        System.out.println(serchedStudent != null ? serchedStudent : "학생을 찾을 수 없습니다.");

    }


    // 데이터 검색 메소드
    private static Student findStudentByID(List<Student> studentList, int id) {
        for(Student student : studentList) {
            if(student.getId() == id) {   // studentList 중 매개변수 입력된 104 같으면

                return student;
            }
        }
        return null;
    }

    // 데이터 삭제 메소드
    private static void deleteStudent(List<Student> studentList, int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                System.out.println("학생 ID " + id + "정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("학새 ID " + id + "을(를) 찾을 수 없습니다.");
    }

    // 데이터 변경 메소드
    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge) {
        // id가 일치하는 학생을 찾아서 변경
        for (Student student : studentList) {
            if (student.getId() == id) { // ID(102번)가 일치하면
                student.setName(newName); // 이름 변경
                student.setAge(newAge); // 나이 변경
                System.out.println("학생 정보가 변경되었습니다: " + student);
                return; // 변경 후 종료
            }
        }
        // 만약 일치하는 학생이 없으면
        System.out.println("해당 ID를 가진 학생을 찾을 수 없습니다.");
    }

    // ArrayList 출력 메소드
    private static void printList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
