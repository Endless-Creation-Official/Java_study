package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain2 {
    public static void main(String[] args) {
        AnimalHospital2<Dog> dogHospital = new AnimalHospital2<>();
        AnimalHospital2<Cat> catHospital = new AnimalHospital2<>();
        AnimalHospital2<Integer> integerHospital = new AnimalHospital2<>();
        AnimalHospital2<Object> objectHospital = new AnimalHospital2<>();
        // 타입 제한이 필요해 보임
    }
}
