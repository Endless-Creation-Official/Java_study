package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        String grade = sc.nextLine();

        if (grade.equals(AuthGrade.GUEST)) {
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
        } else if (grade.equals(AuthGrade.LOGIN)) {
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (grade.equals(AuthGrade.ADMIN)) {
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }
}
