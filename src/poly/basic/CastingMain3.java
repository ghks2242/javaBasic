package poly.basic;

public class CastingMain3 {

    // upcasting vs downcasting
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 생략이 가능하며 생략을권장한다
        Parent parent2 =  child; // 업 캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
