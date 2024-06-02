package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 18, 90);
        Student student2 = createStudent("학생2", 17, 80);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        // 앞의 student는 참조변수 주소를 담을 수 있는 변수

        student.name=name;
        student.age = age;
        student.grade=grade;
        return student;
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name =name; // 앞의 name은 student에 객체에 접근한 name 후자는 매개변수의 name x001.name=매개변수
        student.age= age;
        student.grade=grade;
    }

    static void printStudent(Student student) {
        System.out.println(student.name+" "+ student.age+ " " +student.grade);
    }
}
