package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("count = " + bigData.count);
        System.out.println("data = " + bigData.data);

        // NullPointerException
        System.out.println("data = " + bigData.data.value);

    }
}
