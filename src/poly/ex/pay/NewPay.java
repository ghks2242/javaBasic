package poly.ex.pay;


public class NewPay implements Pay {
    @Override
    public boolean processPay(int amount) {
        System.out.println("NewPay 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
