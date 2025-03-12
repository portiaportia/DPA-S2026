package state;

public class NetflixState implements State {
	private TV tv;
	private String[] movies = { "The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age" };
	private String[] tvShows = { "Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles" };

	public NetflixState(TV tv) {
		this.tv = tv;
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
		for (int i = 0; i < movies.length; i++) {
			System.out.println("- " + movies[i]);
		}
	}

	@Override
	public void pressTVButton() {
		System.out.println("\nNetflix TV Shows:");
		for (int i = 0; i < tvShows.length; i++) {
			System.out.println("- " + tvShows[i]);
		}
	}

}
