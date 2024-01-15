package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
    //  퍼블릭호출
        data.publicField = 1;
        data.publicMethod();
//      디폴트 호출불가
//        data.defaultField = 2;
//        data.defaultMethod();
//      프라이빗 호출불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
