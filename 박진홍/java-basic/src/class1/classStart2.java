package class1;

public class classStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAge = {15,16,17,18};
        int[] stuendtGrade = {90,80,70,60};

        for (int i = 0; i<studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAge[i] + " 성적 : " + stuendtGrade[i]);
        }
    }
}
