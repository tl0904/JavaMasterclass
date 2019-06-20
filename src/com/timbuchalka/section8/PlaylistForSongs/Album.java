package com.timbuchalka.section8.PlaylistForSongs;

import java.util.ArrayList;

/**
 *
 * @author tl0904
 */
public class Album {
    
    private ArrayList<Song> album;
    private String name;

    public Album(String name) {
        this.name = name;
        this.album = new ArrayList<>();
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }
    
    public void addNewSong(String title, String duration) {
        this.album.add(new Song(title, duration));
    }
}
