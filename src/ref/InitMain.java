package ref;

public class InitMain {
    public static void main(String[] args) {
        // new 로 사용해서 객체를 생성하게되면 자동으로 초기화를 해준다.
//      int = 0, boolean = false, 참조형 = null
        InitData data = new InitData();
        System.out.println("value1 : " + data.value1);
        System.out.println("value2 : " + data.value2);
    }
}
