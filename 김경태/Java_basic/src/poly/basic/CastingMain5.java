package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent1);
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child) {
            //Child c = new Parent(); -> 왼쪽을 오른쪽에 담을 수 있는지
            System.out.println("Child 인스턴스가 맞다.");
            Child child = (Child) parent;
            ((Child) child).childMethod();
        }
    }
}
