package poly.ex.pay;

public class NaverPay implements Pay{

    @Override
    public boolean processPay(int amount1) {
        System.out.println("네이버페이 시스템과 연결합니다");
        return true;
    }
}
