package access.ex;

public class Item {
    private String name;
    private int price;
    private int count;


    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    // 내풀이방식
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Item{" +
                "상품명 ='" + name + '\'' +
                "가격 =" + price*count +
                '}';
    }

    // 수업 문제풀이방식
//    public getName() {
//        return name;
//    }
    public int getTotalPrice() {
        return price * count;
    }
}
