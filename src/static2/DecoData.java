package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스천스 변수, 메서드접근 컴파일에러
        // 인스턴스 변수,메서드가 메모리에 생성되지않아서 호출불가
//        instanceValue++;
//        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticMethod= " + staticValue);
    }
}
