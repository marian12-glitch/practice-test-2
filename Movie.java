public class Movie {

	private String title ;
	private String studio ;
	private String rating ;

	public Movie (String title, String studio , String rating){

		this.title = title ;
		this.studio = studio ;
		this.rating = rating ;

	}

	 public Movie (String title, String studio){
	 	title=title;
	 	studio=studio;
	 	rating="PG"

	 }

public static Movie[] getPG(Movie[] mov) {
 Movie[] pgMov = new Movie[mov.length];
 int newArrayIndex = 0;
 for (int i = 0; i < mov.length; i++) {
 if (mov[i].rating.equals(“PG”)) {
 pgMov[newArrayIndex] = mov[i];
 newArrayIndex++;
 		}
 	}
 return pgMov;
}

Movie mov = new Movie(“Casino Royale”,”Eon
 Productions”,”PG-13”);

}