package emoticon;

import effect.Forward;
import sound.ManSound;

public class MaleEmoticon extends Emoticon {

    public MaleEmoticon() {
        soundable = new ManSound();
        effectable = new Forward();
    }

    @Override
    public void display() {
        System.out.println("This is Male Emoticon");
    }
}
