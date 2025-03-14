package Music;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album() {
    }

    public Song findSong(String title) {

        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            System.out.println(title + " succesfully added to the list");
            return true;
        }
        else {
            System.out.println(title + " song already exists in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> Playlist) {
        int index = trackNumber - 1;
        if (index > 0 && index <= this.songs.size()) {
            Playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have song with track number " + trackNumber);
        return false;
    }

    //method overloading
    public boolean addToPlayList(String title, LinkedList<Song> Playlist) {
        for (Song checkSong : this.songs) {
            if (checkSong.getTitle().equals(title)) {
                Playlist.add(checkSong);
                return true;
            }
        }
        System.out.println("this album does not have song with title " + title);
        return false;
    }

}
