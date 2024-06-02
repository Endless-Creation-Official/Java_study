package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; //오류
        this.name = name;
    }

    public void print() {
        System.out.println("회원의 아이디:" + id + " 회원의 이름:" + name);
    }
}
