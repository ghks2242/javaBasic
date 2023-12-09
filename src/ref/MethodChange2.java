package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 전 : dataA = " + dataA.value);

        /*
        * 참조형
        * 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다, 이경우, 메서드 내부에서 파라미터 전달된 객체의 맴버 변수를 변경하면, 호출자의 객체도 변경된다
        * (참조값을 복사하기떄문)
        * */
    }

    public static void changeReference(Data x) {
        x.value = 20;
    }
}
