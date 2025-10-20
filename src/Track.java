public abstract class Track implements Playable {
    private String artist;
    private String title;

    public Track(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

}