package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
//        super(); // ClassB 는 생성자를 정의하여 사용하였으므로 자바가 자동으로 기본생성자를 생성해주지 않는다 따라서 기본생성자가 없어서 컴파일오류가난다
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
