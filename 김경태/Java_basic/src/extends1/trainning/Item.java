package extends1.trainning;

public class Item {
    private String name;
    private  int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름: " + this.name + ", 가격: " + this.price);
    }

    public int getPrice() {
        return this.price;
    }
}
