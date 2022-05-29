import javax.sound.midi.MetaEventListener;

public class Person {
    boolean meditating;

    public Person() {
        meditating = false;
        think();
    }

    // if the method defines an internal class operation, maintain it as a private method for security and performance
    private void think() {
        if(!meditating) {
            think();
        }
    }
}
