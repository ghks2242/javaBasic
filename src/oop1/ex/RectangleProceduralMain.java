package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("정사각형의 넓이 = " + area(rectangle));
        System.out.println("정사각형의 둘레 = " + perimeter(rectangle));
        isSquare(rectangle);
    }

    private static void isSquare(Rectangle rectangle) {
        if((rectangle.width == rectangle.height)){
            System.out.println("정사각형");
        } else {
            System.out.println("직사각형");
        }
    }

    private static int perimeter(Rectangle rectangle) {
        return 2 * (rectangle.height + rectangle.width);
    }

    static int area(Rectangle rectangle) {
        return rectangle.height * rectangle.width;
    }


}
