package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        sound(cat);
        sound(caw);
        move(dog);
        move(cat);
        move(caw);
    }

    private static void sound(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void move(AbstractAnimal animal) {
        System.out.println("동물이동 시작");
        animal.move();
        System.out.println("동물이동 종료");
    }
}
