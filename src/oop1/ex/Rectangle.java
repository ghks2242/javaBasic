package oop1.ex;

public class Rectangle {
    int width;
    int height;


    void isSquare() {
        if((width == height)){
            System.out.println("정사각형");
        } else {
            System.out.println("직사각형");
        }
    }

    void perimeter() {
        int p = 2 * (height + width);
        System.out.println("둘레는 : " + p);
    }

    void area() {
        int p = height * width;
        System.out.println("넓이는 : " + p);
    }

}
