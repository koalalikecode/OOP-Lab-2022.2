package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exist!");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Remove author successfully!");
        }
    }

    @Override
    public int getLength() {
        int res = 0;
        for (Track track : tracks) res += track.getLength();
        return res;
    }

    @Override
    public void play() {
        for (Track track : tracks) track.play();
    }
}


































