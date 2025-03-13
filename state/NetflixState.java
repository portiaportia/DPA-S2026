package state;

import java.util.ArrayList;
import java.util.Arrays;

public class NetflixState extends Application implements State {
	private TV tv;

	public NetflixState(TV tv) {
		this.tv = tv;
		movies = new ArrayList<>(Arrays.asList("The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"));
		tvShows = new ArrayList<>(Arrays.asList("Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"));
	}

	@Override
	public void pressHomeButton() {
		System.out.println("\nLoading the Home Screen...");
		tv.setState(tv.getHomeState());
	}

	@Override
	public void pressNetflixButton() {
		System.out.println("We are already in Netflix");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() {
		System.out.println("\nLoading Hulu...");
		tv.setState(tv.getHuluState());
	}

	@Override
	public void pressMovieButton() {
		System.out.println("\nNetflix Movies:");
		displayMovies();
	}

	@Override
	public void pressTVButton() {
		System.out.println("\nNetflix TV Shows:");
		displayTVShows();
	}

}
