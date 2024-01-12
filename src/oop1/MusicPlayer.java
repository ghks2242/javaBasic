package oop1;

public class MusicPlayer {

    // 음악플레이어를 구성하기위한 속성과 기능이 하나의 캡슐에 쌓여있는것 같다 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는걸 캡슐화라고한다
    int volume = 0;
    boolean isOn = false;

    void showStatus() {
        System.out.println("음악 플레이어를 상태확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어를 볼륨: " + volume);
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어를 볼륨: " + volume);
    }

    void on( ) {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
