package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        // 자식의 기능은 로출 불가능
        //poly.childMehod();

        // 일시적 다운 캐스팅(부모 타입 - 자식타입으로)
        ((Child)poly).childMethod();
    }
}
