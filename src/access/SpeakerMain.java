package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // private 으로 접근제어자를 설정하여 다른 클래스에서는 접근이불가
        speaker.showVolume();
    }
}
