package poly.ex1;


public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animals = {dog, caw, cat};
        for (Animal animal : animals) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }
    }

}
