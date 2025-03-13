package Music;

import java.util.ArrayList;
import java.util.LinkedList;

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

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("Dushtaya", playList_1);
        albums.get(1).addToPlayList("Kiri Kodu", playList_1);
        albums.get(0).addToPlayList("Awasana Washayen", playList_1);
        albums.get(1).addToPlayList("Mana Bandu", playList_1);

        play(playList_1);

        LinkedList<Song> playList_2 = new LinkedList<>();

        albums.get(1).addToPlayList("Neththara", playList_2);
        albums.get(0).addToPlayList("Yeheli", playList_2);
        albums.get(1).addToPlayList("Chandani Payala", playList_2);
        albums.get(0).addToPlayList("Kalunika", playList_2);

        play(playList_2);
    }
    private static void play(LinkedList<Song> playList) {

    }

    private static void printMenu(){
        System.out.println("Available options");
        System.out.println("1. Play next song\n" +
                "2. Play previous song\n" +
                "3. Replay the current song\n" +
                "4. List of all songs\n" +
                "5. All available options\n" +
                "6. Delete current song\n" +
                "7. Exit");
    }
}