package facade_pattern;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){
        System.out.println(" Get ready to watch movie ");
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.setInput(dvdPlayer);
        projector.display();
        soundSystem.on();
        soundSystem.setVolume(10);
        soundSystem.surroundSound();
    }

    public void endMovie(){
        System.out.println(" Shutting down the movie theater !!!");
        dvdPlayer.stop();
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
