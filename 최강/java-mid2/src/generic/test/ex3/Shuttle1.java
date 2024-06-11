package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle1<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public void showInfo() {
        System.out.println(unit);
    }

}
