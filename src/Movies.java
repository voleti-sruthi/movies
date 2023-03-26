import java.util.ArrayList;

public class Movies {
    private final String title;
    private final String studio;
    private final String rating;


    Movies(String title,String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movies(String title,String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public static ArrayList<Movies> getPg(ArrayList<Movies> moviesList){
        ArrayList<Movies> pgRatedMovies = new ArrayList<>();
        for(Movies checkRating: moviesList){
            if(checkRating.rating.equals("PG")){
                Movies temp = new Movies(checkRating.title,checkRating.studio,checkRating.rating);
                pgRatedMovies.add(temp);
            }
        }
        return  pgRatedMovies;
    }
    public static void main(String[] args){

        ArrayList<Movies> moviesList = new ArrayList<>();
        Movies  casinoRoyale = new Movies("Casino Royale","Eon Productions","PG-13");
        moviesList.add(casinoRoyale);
        Movies titanic = new Movies("Titanic","20th Century Studios");
        moviesList.add(titanic);
        Movies avatar = new Movies("Avatar","Lightstorm Entertainment","R");
        moviesList.add(avatar);

        ArrayList<Movies> pgRatedMovies = getPg(moviesList);
        System.out.println("PG rated movies are");
        for(Movies iterator : pgRatedMovies)
        {
            System.out.println(iterator.title);
        }
    }
}