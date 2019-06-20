package com.timbuchalka.section8.PlaylistForSongs;

/**
 *
 * @author tl0904
 */
public class Song {
    
    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }
    
}
