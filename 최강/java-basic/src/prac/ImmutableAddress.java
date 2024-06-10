package prac;

public class ImmutableAddress {
    private final String address;

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "address=" + address +
                '}';
    }
}
