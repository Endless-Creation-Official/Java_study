package poly.basic;

public class CastingMain4 {
    //다운캐스팅을 자동으로 하지 않는 이유
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2; //런타임 오류 - ClassCastException
        child2.childMethod(); //실행 불가

    }
}
