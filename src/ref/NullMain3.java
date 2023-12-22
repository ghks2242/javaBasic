package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("count = " + bigData.count);
        System.out.println("data = " + bigData.data);

        // NullPointerException
        System.out.println("data = " + bigData.data.value);

    }
}
