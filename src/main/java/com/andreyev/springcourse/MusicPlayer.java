package com.andreyev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(List musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer() {}

    public void playMusicList() {
        for (Music music: musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void playMusic() {
        System.out.println("Playing: " + musicList.get(0).getSong());
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
