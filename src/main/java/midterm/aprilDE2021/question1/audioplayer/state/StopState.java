package midterm.aprilDE2021.question1.audioplayer.state;

import midterm.aprilDE2021.question1.audioplayer.AudioPlayer;
import midterm.aprilDE2021.question1.audioplayer.model.Song;

import java.util.Optional;

public class StopState extends State {


    public StopState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    void stop() {

    }

    @Override
    void start() {
        Song firstSong = Optional.ofNullable(audioPlayer.getSongs().get(0)).get();
        audioPlayer.setCurrentSong(firstSong);
    }

    @Override
    void pause() {

    }
}
