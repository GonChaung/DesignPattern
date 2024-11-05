package facade_pattern;

public class SoundSystem {
    public void on() {
        System.out.println(" SoundSystem IS ON !!");
    }

    public void off() {
        System.out.println(" SoundSystem IS OFF !!");
    }

    public void setVolume(int setVolume) {
        System.out.println(" Set volume to " + setVolume);
    }

    public void surroundSound() {
        System.out.println(" SurroundSound is ON !!");
    }
}
