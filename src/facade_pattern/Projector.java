package facade_pattern;

public class Projector {
    public void on() {
        System.out.println(" PROJECTOR IS ON !!");
    }

    public void off() {
        System.out.println(" PROJECTOR IS OFF !!");
    }

    public void display() {
        System.out.println(" PROJECTOR IS DISPLAYING !! ");
    }

    public void setInput(DVDPlayer dvdPlayer){
        System.out.println(" SETTING INPUT TO DVD PLAYER ");
    }
}
