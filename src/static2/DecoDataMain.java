package static2;

//import static static2.DecoData.*;

//import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);



    }
}
