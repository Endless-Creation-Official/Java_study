package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학민";
        student1.age = 25;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "영준";
        student2.age = 24;
        student2.grade = 100;

        //student[] students = new Students[] {student1, student2};와 같다.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for(Student s: students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 점수: " + s.grade);
        }

    }
}
