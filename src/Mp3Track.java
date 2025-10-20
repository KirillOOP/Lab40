class MP3Track extends Track {

    public MP3Track(String artist, String title) {
        super(artist, title);
    }

    @Override
    public void play() {
        System.out.println("Відтворення MP3 треку (зі стисненням): " + getTitle() + " - " + getArtist());
    }
}