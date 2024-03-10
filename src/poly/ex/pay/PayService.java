package poly.ex.pay;

public class PayService {
    private Pay pay;
    public void processPay(String option, int amount) {
        pay = findPay(option);
        result(this.pay != null ? true : false, option, amount);
    }

    private Pay findPay(String option) {
        if (option == "kakao") {
            this.pay = new KakaoPay();
        } else if(option == "naver") {
            this.pay = new NaverPay();
        } else if(option == "new") {
            this.pay = new NewPay();
        } else {
            this.pay = null;
        }
        return pay;
    }

    public void result(boolean rst, String option, int amount) {
        if(rst && pay.processPay(amount)) {
            System.out.println("결제를 시작합니다: option=" +option +", amount="+amount);
            System.out.println(amount+"원 결제를 시도합니다.");
            System.out.println("결제에 성공하셨습니다.");
        } else{
            System.out.println("결제에 실패하였습니다.");
        }
        System.out.println();
    }
}
