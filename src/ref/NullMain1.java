package ref;

public class NullMain1 {
    public static void main(String[] args) {

        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);

        // 자바에서는 아무도 참조하지않는 인스턴스가있으면 JVM 의 GC가 더이상 사용하지않는 인스턴스라고 판단하고 자동으로 메모리에서 삭제해준다.
    }
}
