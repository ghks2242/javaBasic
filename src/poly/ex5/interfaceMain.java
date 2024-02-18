package poly.ex5;

public class interfaceMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }

        for (Animal animal : animals) {
            System.out.println("동물이동 시작");
            animal.move();
            System.out.println("동물이동 종료");
        }
    }
}
