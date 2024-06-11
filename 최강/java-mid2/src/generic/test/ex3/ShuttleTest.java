package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린1", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> zerglingShuttle = new Shuttle<>();
        zerglingShuttle.in(new Zergling("저그1", 35));
        //System.out.println(zerglingShuttle.showInfo());

        Shuttle<Zealot> zealotShuttle = new Shuttle<>();
        zealotShuttle.in(new Zealot("질럿1", 100));
        zealotShuttle.showInfo();

        Shuttle1<Marine> marineShuttle1 = new Shuttle1<>();
        marineShuttle1.in(new Marine("마아린", 1));
        marineShuttle1.showInfo();
    }
}
