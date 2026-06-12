package com.langfunda.constructors;

public class Movie {

	String director;
	String producer;
	String hero;
	String heroine;
	double budget;
	String movieName;

	public Movie() {
		System.out.println("no arg constructor !");
	}

	public Movie(String director) {
		System.out.println("one arg constructor !");
		this.director = director;
	}

	public Movie(Movie m, String producer) {
		this.director = m.director;
		this.producer = producer;
	}

	public Movie(Movie m, String hero, String heroine) {
		this.director = m.director;
		this.producer = m.producer;
		this.hero = hero;
		this.heroine = heroine;
	}
	
	public Movie(Movie m, String movieName, double budget){
			this.director = m.director;
			this.producer = m.producer;
			this.hero = m.hero;
			this.heroine = m.heroine;
			this.movieName = movieName;
			this.budget = budget;
			
	}	
	

	public static void main(String[] args) {
		System.out.println("main method started ");

		Movie m1 = new Movie();
		m1.movieInfo();

		Movie m2 = new Movie("Buchi Babu");
		m2.movieInfo();

		Movie m3 = new Movie(m2, "Mytri Movies");
		m3.movieInfo();

		Movie m4 = new Movie(m3, "Ram Charan", "Jahnavi Kapoor");
		m4.movieInfo();
		
		Movie m5 = new Movie(m4, "Peddi", 300000000.00);
		m5.movieInfo();
		
		

	}

	void movieInfo() {
		System.out.println("Name of the director : " + director);
		System.out.println("Name of the Producer : " + producer);
		System.out.println("Name of the Hero : " + hero);
		System.out.println("Name of the heroine : " + heroine);
		System.out.println("Name of the Movie : " + movieName);
		System.out.println("Budget of the Movie " + budget);
		System.out.println("*************************************");
	}
}
