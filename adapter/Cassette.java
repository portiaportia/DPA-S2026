package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
	private ArrayList<String> songs = new ArrayList<String>();
	private int currentIndex = 0;

	public Cassette(ArrayList<String> songs) {
		this.songs = songs;
	}

	@Override
	public String play() {
		if (currentIndex >= songs.size()) {
			return "At the end of the cassette you need to rewind";
		}
		currentIndex++;
		return "Playing song " + currentIndex + ": " + songs.get(currentIndex - 1);
	}

	@Override
	public String rewind() {
		currentIndex--;
		if (currentIndex < 0) {
			currentIndex = 0;
			return "Fully Re-wound";
		}
		return "Rewinding to song " + (currentIndex + 1);
	}

	@Override
	public String ffwd() {
		if (currentIndex >= songs.size()) {
			currentIndex = songs.size();
			return "At the end of the cassette you need to rewind";
		}
		currentIndex++;

		if (currentIndex == songs.size()) {
			return "Forwarded to the end of the cassette";
		}

		return "Forward to song " + (currentIndex + 1);
	}

	@Override
	public String pause() {
		return "Pausing...";
	}

	@Override
	public String stopEject() {
		return "Stopping cassett and ejecting";
	}

}
