package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);
        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data1.count);
        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data1.count);
        // 힙영역에서 인스턴스 abc를 만들면 각각 만들어지기 그때마다 count 변수도 새로 만들어짐
        // 인스턴스의 멤버변수 count는 인스턴스끼리 공유되지 않음
    }
}
