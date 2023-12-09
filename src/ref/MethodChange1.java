package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 전 : a = " + a);

        /*
        * 기본형
        * 메서드로 기본형 데이터를 전달하면, 해당값이 복사되어 전달된다. 이경우, 메서드 내부에서 매개변수(파라미터) 값을 변경해도, 호출자의 변수 값에는 영향이없다.
        * (값만 복사하기떄문)
        * */
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
