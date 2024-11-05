package facade_pattern;

public class DVDPlayer {
    public void on() {
        System.out.println(" DVD PLAYER IS ON !!");
    }

    public void off() {
        System.out.println(" DVD PLAYER IS OFF !!");
    }

    public void play(String movie) {
        System.out.println(" Playing " + movie );
    }

    public void stop() {
        System.out.println(" DVD PLAYER IS STOPPED !!");
    }
}
