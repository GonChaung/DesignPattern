package facade_pattern;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);
        homeTheaterFacade.watchMovie("Avatar");
        homeTheaterFacade.endMovie();
    }
}
