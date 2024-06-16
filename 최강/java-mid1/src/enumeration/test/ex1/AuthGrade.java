package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3, "관리자"),;

    private int level;
    private String name;

    AuthGrade(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
