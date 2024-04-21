package midterm.aprilDE2021.question1.audioplayer;

import midterm.aprilDE2021.question1.audioplayer.model.Song;

import java.util.List;

public class AudioPlayer {

    private Song currentSong;

    private List<Song> songs;

    public Song getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(Song currentSong) {
        this.currentSong = currentSong;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public AudioPlayer(List<Song> songs) {
        this.songs = songs;
    }

    public void stop() {

    }

    public void play() {

    }

    public void pause() {

    }

    public void next() {

    }

    public void previous() {

    }

    public void addSong(Song song) {

    }

    public void removeSong(Song song) {

    }

    public void undo() {

    }

    public void redo() {

    }
}
