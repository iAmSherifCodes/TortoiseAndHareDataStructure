package chapter7.TortoiseHare;

public class RaceTrack {
    private int[] tracks = new int[71];

    public RaceTrack(int[] tracks) {
        this.tracks = tracks;
    }

    public int[] getTracks() {
        return tracks;
    }

    public void setTracks(int[] tracks) {
        this.tracks = tracks;
    }
}
