package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("countA = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("countB = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("countC = " + data3.count);
    }
}
