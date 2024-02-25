import effect.Forward;
import emoticon.Emoticon;
import emoticon.FemaleEmoticon;
import emoticon.MaleEmoticon;

public class EmotionSimulator {

    public static void main(String[] args) {

        Emoticon man = new MaleEmoticon();
        man.performSound();
        man.performMove();

        System.out.println("================");

        Emoticon girl = new FemaleEmoticon();
        girl.performMove();
        girl.performSound();

        girl.setMovable(new Forward());
        girl.performMove();
    }
}
