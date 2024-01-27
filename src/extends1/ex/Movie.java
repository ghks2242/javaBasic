package extends1.ex;

public class Movie extends Item{
    private String directer;
    private String actor;

    public Movie(String name, int price, String directer, String actor) {
        super(name, price);
        this.directer = directer;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + directer + " 배우 : " + actor);
    }

}
