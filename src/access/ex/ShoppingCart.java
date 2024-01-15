package access.ex;

import java.util.ArrayList;

public class ShoppingCart {

    // 내가 푼 방식
    ArrayList<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        if (items.size() >= 10) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        items.add(item);
    }

    public void displayItems() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice() * item.getCount();
            System.out.println(item.toString());
        }
        System.out.println("합계= " + sum);
    }

    // 수업 문제풀이 방식
    private Item[] itemss = new Item[10];
    private int itemCount;

//    public void addItem(Item item) {
//        if (itemCount >= itemss.length) {
//            System.out.println("장바구니가 가득찼습니다.");
//            return;
//        }
//        items[itemCount] = item;
//        itemCount++;
//    }
//    public void displayItems() {
//        for (int i = 0; i < itemCount; i++) {
//            Item item = items[i];
//            System.out.println("상품명 : " + item.getName() + " 가격 : " + item.getTotalPrice());
//        }
//        System.out.println("총합 : " + totalPrice());
//    }
//
//    private int totalPrice() {
//        int total = 0;
//        for (int i = 0; i < itemCount; i++) {
//            Item item = items[i];
//            total += item.getTotalPrice();
//        }
//        return total;
//    }
}
