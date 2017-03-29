package com.saikiran.spring;

import java.util.ArrayList;

public class MovieFinder {
	private static ArrayList<String> comedyMovies = new ArrayList();
	private static ArrayList<String> actionMovies = new ArrayList();
	private static ArrayList<String> thrillerMovies = new ArrayList();
	public MovieFinder(){
		loadMovies();
	}
	public ArrayList<String> movieGenre(String userPreference){
		if(userPreference.equalsIgnoreCase("comedyMovies")){
			return comedyMovies;
		}
		else if(userPreference.equalsIgnoreCase("actionMovies")){
			return actionMovies;
		}
		else
	}
	private void loadMovies(){
		comedyMovies.add("La La Land");
		actionMovies.add("gladiator");
		thrillerMovies.add("Narcos");
	}
}
