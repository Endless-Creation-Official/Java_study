package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("t = " + box.getValue());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("t = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        Animal animal = box.getValue();
        System.out.println("이름:" + animal.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("이름: " + animal.getName());
    }

    static <T extends Animal> T printReturnGenericV3(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름: " + t.getName());
        return t;
    }

    static Animal printReturnWildcardV3(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("이름: " + animal.getName());
        return animal;
    }




}
