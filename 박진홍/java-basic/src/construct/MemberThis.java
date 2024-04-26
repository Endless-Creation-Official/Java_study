package construct;

public class MemberThis {
    String nameField;

    // 매개변수가 이름이 다르기 때문에, this 사용 필요 없음.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
