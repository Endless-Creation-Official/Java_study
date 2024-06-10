package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    /*   public T showInfo() {
           return unit;
       }*/
    // println 으로 호출할때만 값이 나오고 아니면 따로 지정해줘야 함
    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름:" + unit.getName() + "hp: " + unit.getHp());
    }

}
