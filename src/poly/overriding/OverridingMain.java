package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스를 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스를 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);    // 변수(필드)는 오버라이딩 x
        poly.method();   // 메소드는 오버라이딩 o
        // poly 는 new Child 로 생성을해서 메모리상에 Parent 와 Child 를 가진다
        // 타입이 Parent 로 지정을해서 Parent 부터 찾는다
        // Parent 의 value 를찾고 method 를 실행하려하지만 하위타입에 Child 에 오버라이딩이 되어있어 하위타입의 method 가 실행된다
        // ** 오버라이딩된 메서드는 항상 우선권을 가진다 ***

    }
}
