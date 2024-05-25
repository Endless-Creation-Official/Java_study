package static1;

public class Data2 {
    String name;
    Data2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
