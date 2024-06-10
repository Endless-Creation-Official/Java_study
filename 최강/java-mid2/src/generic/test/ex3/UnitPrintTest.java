package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class UnitPrintTest {
    public static void main(String[] args) {
        Shuttle<Marine> marineShuttle = new Shuttle<>();
        marineShuttle.in(new Marine("마린", 40));

        Shuttle<Zealot> zealotShuttle = new Shuttle<>();
        zealotShuttle.in(new Zealot("질럿", 31));

        Shuttle<Zergling> zerglingShuttle = new Shuttle<>();
        zerglingShuttle.in(new Zergling("저그", 100));

        UnitPrinter.printV1(marineShuttle);
        UnitPrinter.printV2(zealotShuttle);

    }
}
