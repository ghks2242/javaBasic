package poly.ex.pay;

public class KakaoPay implements Pay{

    @Override
    public boolean processPay(int amount1) {
        System.out.println("카카오페이 시스템과 연결합니다");
        return true;
    }
}
