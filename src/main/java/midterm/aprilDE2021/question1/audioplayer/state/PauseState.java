package midterm.aprilDE2021.question1.audioplayer.state;

import midterm.aprilDE2021.question1.audioplayer.AudioPlayer;

public class PauseState extends State {

    public PauseState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    void stop() {
        audioPlayer.setCurrentSong(null);
    }

    @Override
    void start() {

    }

    @Override
    void pause() {

    }
}
