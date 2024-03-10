package strategy.sound;

public class QuietSound implements Soundable {

    public void sound() {
        System.out.println("Quiet");
    }
}
