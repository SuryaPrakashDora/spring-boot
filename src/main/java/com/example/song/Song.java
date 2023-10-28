// Write your code here

package com.example.song;

public class Song {
    private int songId;
    private String songName;
    private String Lyricist;
    private String Singer;
    private String musicDirector;

    public Song(int songId, String songName, String Lyricist, String Singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.Lyricist = Lyricist;
        this.Singer = Singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLyricist() {
        return Lyricist;
    }

    public void setLyricist(String Lyricist) {
        this.Lyricist = Lyricist;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String Singer) {
        this.Singer = Singer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
}