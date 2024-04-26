package class1.ex;

public class StudentDB {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student student1 = new Student();
        student1.name = "박진홍";
        student1.id = 21;
        student1.age = 24;
        students[0] = student1;

        Student student2 = new Student();
        student2.name = "강영훈";
        student2.id = 22;
        student2.age = 22;
        students[1] = student2;

        Student student3 = new Student();
        student3.name = "김경태";
        student3.id = 22;
        student3.age = 25;
        students[2] = student3;

        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 학번: " + s.id + ", 나이: " + s.age);
        }
    }
}