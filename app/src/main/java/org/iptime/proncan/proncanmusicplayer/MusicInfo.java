package org.iptime.proncan.proncanmusicplayer;

import android.media.Image;

public class MusicInfo {
    public Image image;
    public String music_name;
    public String artist;

    public MusicInfo(Image img, String music_name, String artist) {
        this.image = img;
        this.music_name = music_name;
        this.artist = artist;
    }
}
