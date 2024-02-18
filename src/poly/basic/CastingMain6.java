package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("2 호출");
        call(parent2);

    }


    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스의 경우 childMethod() 실행
        // 자바 16 이상 기능 추가
        // 인스턴스오브 뒤에 변수를 추가 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
