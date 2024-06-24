package collection.set;

import java.util.Objects;

public class Member {
    String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }
}
