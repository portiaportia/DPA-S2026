package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum {
	private ArrayList<String> songs = new ArrayList<String>();
	private int currentIndex = 0;

	public CD(ArrayList<String> songs) {
		this.songs = songs;
	}

	@Override
	public String playFromBeginning() {
		currentIndex = 0;
		currentIndex++;
		return "Playing song 1: " + songs.get(0);
	}

	@Override
	public String playSong(int num) {
		if (num < 0 || num >= songs.size()) {
			return "Not a valid song number";
		}
		currentIndex = num;
		currentIndex++;
		return "Playing " + songs.get(currentIndex - 1);
	}

	public String nextSong() {

		if (currentIndex >= songs.size()) {
			currentIndex = 0;
		}
		currentIndex++;
		return "Playing: " + currentIndex + ": " + songs.get(currentIndex - 1);
	}

	public String prevSong() {
		currentIndex--;

		if (currentIndex < 0) {
			currentIndex = 0;
		}
		return "Skipping back and playing: " + songs.get(currentIndex - 1);
	}

	@Override
	public String pause() {
		return "Pausing";
	}

	@Override
	public String stop() {
		currentIndex = 0;
		return "Stopping";

	}

}
