package generic.ex3;


public class AnimalHospital2<T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T 타입을 메서드를 정의하는 시점에는 알 수 없다. Object 기능만 사용가능
        animal.toString();
        animal.equals(null);
        //System.out.println("동물이름: " + animal.getName());
        //System.out.println("동물사이즈: " + animal.getSize());
    }

    public T biggerAnimal(T target) {
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
