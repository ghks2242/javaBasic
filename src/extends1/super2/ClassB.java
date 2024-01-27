package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
//        super(); // 매개변수가없는 생성자의 경우 생략가능
        this(a, 0);   // super 대신 this 를 사용해도되지만 언젠가 한번은 super 를 호출해야한다.
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
//        super(); // 매개변수가없는 생성자의 경우 생략가능
        // 생략하여도 결과는 똑같이나온다 자바가 자동으로 넣어주기떄문.
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
