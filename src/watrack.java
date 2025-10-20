class WAVTrack extends Track {

    public WAVTrack(String artist, String title) {
        super(artist, title);
    }

    @Override
    public void play() {
        System.out.println("Відтворення WAV треку (без стиснення): " + getTitle() + " - " + getArtist());
    }
}