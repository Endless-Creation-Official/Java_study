package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("a");
        System.out.println("a count=" + Data3.count);

        Data3 data2 = new Data3("b");
        System.out.println("b count=" + Data3.count);

        Data3 data3 = new Data3("c");
        System.out.println("c count=" + Data3.count);
        // count 정적변수에 접근하여 계산
        // static 이 붙은 멤버 변수 count 는 인스턴스 영역에 생성되지 않는다. 대신에 메서드 영역에서 이 변수
        //를 관리한다.
    }
}
