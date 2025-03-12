package state;

public class HuluState implements State {
	private TV tv;
	private String[] movies = { "Cars", "Cinderella", "Wall-E", "ET" };
	private String[] tvShows = { "sesame street", "care bears", "loney tunes" };

	public HuluState(TV tv) {
		this.tv = tv;
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
		for (int i = 0; i < movies.length; i++) {
			System.out.println("- " + movies[i]);
		}
	}

	@Override
	public void pressTVButton() {
		System.out.println("\nHulu TV Shows:");
		for (int i = 0; i < tvShows.length; i++) {
			System.out.println("- " + tvShows[i]);
		}
	}
}
