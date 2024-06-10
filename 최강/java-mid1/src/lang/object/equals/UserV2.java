package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public boolean equals(Object obj) {
        // obj.id 이렇게 접근 불가능하니까
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }

/*
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
*/

}
