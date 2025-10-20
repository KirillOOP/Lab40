import java.util.ArrayList;
import java.util.List;

class Playlist {
    private String name;
    private List<Playable> tracks = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addTrack(Playable track) {
        tracks.add(track);
    }

    public void playAll() {
        System.out.println("--- Початок відтворення плейлиста '" + name + "' ---");
        if (tracks.isEmpty()) {
            System.out.println("Плейлист порожній.");
            return;
        }
        for (Playable track : tracks) {
            track.play(); // Поліморфізм в дії!
        }
        System.out.println("--- Кінець плейлиста ---");
    }
}