package Music;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Kalunika","Smokio");

        album.addSong("Kalunika",3.0);
        album.addSong("Dushtaya",4.0);
        album.addSong("Awasana Washayen",3.5);
        album.addSong("Yeheli",3.2);
        albums.add(album);

        album = new Album("Neththara","BNS");

        album.addSong("Neththara",3.0);
        album.addSong("Kiri Kodu",4.2);
        album.addSong("Chandani Payala",3.6);
        album.addSong("Mana Bandu",3.5);
        albums.add(album);

        
    }
}