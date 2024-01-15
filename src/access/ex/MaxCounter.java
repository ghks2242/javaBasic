package access.ex;

public class MaxCounter {
    private int counter;
    private int max;
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (counter >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        counter++;
    }

    public int getCount() {
        return counter;
    }
}
