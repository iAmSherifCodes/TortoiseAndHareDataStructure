package chapter7.TortoiseHare;

import chapter7.TortoiseHare.racers.Hare;
import chapter7.TortoiseHare.racers.Tortoise;

public class RaceTrack {
    private int[] tracks = new int[71];

    private Hare hare;

    private int harePosition;
    private int tortoisePosition;
    private Tortoise tortoise;

    public void startRace(){
        hare = new Hare();
        tortoise = new Tortoise();
    }

    public RaceTrack(int[] tracks) {
        this.tracks = tracks;
    }

    public int[] getTracks() {
//        tracks[harePosition] = hare
        return tracks;
    }

    public void setTracks(int[] tracks) {
        this.tracks = tracks;
    }


}
