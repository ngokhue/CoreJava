package collection;

import java.util.Arrays;
import java.util.List;

public class FootballTeam {
	private String club, manager;

	public String getClub() {
	    return club;
	}

	public void setClub(String club) {
	    this.club = club;
	}

	public String getManager() {
	    return manager;
	}

	public void setManager(String manager) {
	    this.manager = manager;
	}

	public FootballTeam(String club, String manager) {
	    this.club = club;
	    this.manager = manager;
	}

	@Override
	public String toString() {
	    return "\nClub: " + club + ", Manager: " + manager;
	}


	public static void main(String[] args) {
	    List<FootballTeam> list = Arrays.asList(
	            new FootballTeam("Manchester", "Ole Gunnar Solskjær"),
	            new FootballTeam("Chelsea", "Frank Lampard"),
	            new FootballTeam("Liverpool", "John The Reds"),
	            new FootballTeam("HAGL", "John The Rock"),
	            new FootballTeam("Arsenal", "Unai Emery")
	    );

	    System.out.println(list);
	    System.out.println("-------------");

	    list.stream()
	            .filter(ele -> ele.getManager().startsWith("John"))
	            .forEach(s -> System.out.println("Club has John: " + s.getClub()));
	    
	}

}
