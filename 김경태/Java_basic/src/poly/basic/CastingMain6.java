package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent1);
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스이므로 childMethod() 실행
        if(parent instanceof Child child) {
            //Child c = new Parent(); -> 왼쪽을 오른쪽에 담을 수 있는지
            System.out.println("Child 인스턴스가 맞다.");
            // Child child = (Child) parent; 위에서 instanceof와 동시에 child인스턴스를 선언했기 때문에 필요없는 코드
            ((Child) child).childMethod();
        }
    }
}
