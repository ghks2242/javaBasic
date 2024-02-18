package poly.ex3;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        sound(cat);
        sound(caw);

    }

    private static void sound(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
