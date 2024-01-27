package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 또는 같은패키지 이므로 불러쓸수잇다.
//        defaultValue = 1; 다른 패키지 접근불가. 컴파일오류
//        privateValue = 1; 접근불가, 컴파일오류

        publicMethod();
        protectedMethod();
//        defaultMethod();  다른패키지 접근불가. 컴파일오류
//        privateMethod();  접근불가, 컴파일오류

        printParent();
    }
}
