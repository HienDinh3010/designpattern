package midterm.aprilDE2021.question1.audioplayer.state;

import midterm.aprilDE2021.question1.audioplayer.AudioPlayer;

public abstract class State {

    protected AudioPlayer audioPlayer;

    public State(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    abstract void stop();
    abstract void start();
    abstract void pause();
}
