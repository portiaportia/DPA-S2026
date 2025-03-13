package state;

import java.util.ArrayList;
import java.util.Arrays;

public class HuluState extends Application implements State {
	private TV tv;

	public HuluState(TV tv) {
		this.tv = tv;
		movies = new ArrayList<>(Arrays.asList("Cars", "Cinderella", "Wall-E", "ET"));
		tvShows = new ArrayList<>(Arrays.asList("Sesame Street", "Care Bars", "Loney Tunes"));
	}

	@Override
	public void pressHomeButton() {
		System.out.println("\nLoading the Home Screen...");
		tv.setState(tv.getHomeState());
	}

	@Override
	public void pressNetflixButton() {
		System.out.println("\nLoading Hulu...");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() {
		System.out.println("We are already in Hulu");
		tv.setState(tv.getHuluState());
	}

	@Override
	public void pressMovieButton() {
		System.out.println("\nHulu Movies:");
		displayMovies();
	}

	@Override
	public void pressTVButton() {
		System.out.println("\nHulu TV Shows:");
		displayTVShows();
	}

	@Override
	public void watch(String title) {
		super.watch(title);
	}
}
