package extends1.access.childe;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedvalue = 1; //상속 or 같은 패키지
        //defaultVlaue = 1; 같은 package에 없으므로 오류
        //privateValue = 1;

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();
        printParent();
    }

}
