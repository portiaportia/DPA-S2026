package state;

import java.util.ArrayList;

public abstract class Application {
    protected ArrayList<String> movies;
    protected ArrayList<String> tvShows;

    public void watch(String title) {
        if(contains(title, movies)){
            System.out.println("Watching the movie " + title);
            return;
        }
        if(contains(title, tvShows)){
            System.out.println("Watching the TV show " + title);
            return;
        }

        System.out.println("Sorry " + title + " is currently unavailable");
    }

    private boolean contains(String title, ArrayList<String> list){
        for(String item : list){
            if(item.equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

    public void displayMovies() {
        displayList(movies);
    }

    public void displayTVShows() {
        displayList(tvShows);
    }

    private void displayList(ArrayList<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }
}
