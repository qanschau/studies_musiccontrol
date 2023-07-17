import com.anschaucorp.studies_musiccontrol.model.Music;
import com.anschaucorp.studies_musiccontrol.model.MyFavorites;
import com.anschaucorp.studies_musiccontrol.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Nothing Else Matters");
        myMusic.setAlbum("Black");
        myMusic.setArtist("Metallica");
        myMusic.setType("Metal");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();            
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 2000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 4000; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.add(myMusic);
        myFavorites.add(myPodcast);
    }
}
