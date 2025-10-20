public class Main {
    public static void main(String[] args) {
        // Створюємо плейлист
        Playlist myPlaylist = new Playlist("Мої улюблені треки");

        // Створюємо треки різних форматів
        Track track1 = new MP3Track("AC/DC", "Highway to Hell");
        Track track2 = new WAVTrack("Queen", "Bohemian Rhapsody");
        Track track3 = new MP3Track("Nirvana", "Smells Like Teen Spirit");

        // Додаємо всі треки до одного списку
        myPlaylist.addTrack(track1);
        myPlaylist.addTrack(track2);
        myPlaylist.addTrack(track3);

        // Відтворюємо весь плейлист одним методом
        myPlaylist.playAll();
    }
}