package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1,"학생1",80,18);
        MemberInit memberInit2 = new MemberInit();
        initMember(memberInit2,"학생2",90,18);
        MemberInit[] members = {memberInit1, memberInit2};

        for (MemberInit s : members) {
            System.out.println("학생이름: " + s.name + "학생등급: " + s.grade + "학생나이: " + s.age);
        }
    }

    static void initMember(MemberInit memberInit, String name, int grade, int age) {
        memberInit.name=name;
        memberInit.grade=grade;
        memberInit.age = age;
    }

}
