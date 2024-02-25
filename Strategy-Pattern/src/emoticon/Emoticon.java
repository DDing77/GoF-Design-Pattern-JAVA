package emoticon;

import effect.Effectable;
import sound.Soundable;

public abstract class Emoticon {

    Soundable soundable;
    Effectable effectable;

    public Emoticon() {
    }

    public abstract void display();

    public void performSound() {
        soundable.sound();
    }

    public void performMove() {
        effectable.effect();
    }

    public void setSoundable(Soundable soundable) {
        this.soundable = soundable;
    }

    public void setMovable(Effectable effectable) {
        this.effectable = effectable;
    }
}
