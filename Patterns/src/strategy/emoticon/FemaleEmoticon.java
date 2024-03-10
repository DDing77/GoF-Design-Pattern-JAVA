package strategy.emoticon;

import strategy.effect.Shining;
import strategy.sound.GirlSound;

public class FemaleEmoticon extends Emoticon {

    public FemaleEmoticon() {
        soundable = new GirlSound();
        effectable = new Shining();
    }

    @Override
    public void display() {
        System.out.println("This is Female Emoticon");
    }
}
