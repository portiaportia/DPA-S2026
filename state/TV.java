package state;

public class TV {
	private State state;
	private State homeState;
	private State netflixState;
	private State huluState;

	public TV() {
		homeState = new HomeState(this);
		netflixState = new NetflixState(this);
		huluState = new HuluState(this);
		state = homeState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getHomeState() {
		return homeState;
	}

	public State getNetflixState() {
		return netflixState;
	}

	public State getHuluState() {
		return huluState;
	}

	public void pressHomeButton() {
		state.pressHomeButton();
	}

	public void pressNetflixButton() {
		state.pressNetflixButton();
	}

	public void pressHuluButton() {
		state.pressHuluButton();
	}

	public void pressMovieButton() {
		state.pressMovieButton();
	}

	public void pressTVButton() {
		state.pressTVButton();
	}

	public void watch(String title){
		state.watch(title);
	}

}
