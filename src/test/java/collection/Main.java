package collection;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<FootballTeam> list = Arrays.asList(new FootballTeam("Arsenal", "Arsène Wenger"),
				new FootballTeam("Manchester United", "José Mourinho"),
				new FootballTeam("Newcastle United", "John Carver"), new FootballTeam("Derby County", "John Gregory"));
		System.out.println(list);

		List<Player> listPlayer = Arrays.asList(
				new Player("Bob Donaldson", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Fred Erentz", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Joe Cassidy", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("James McNaught", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Joe Cassidy", "01/01/1990", 1, 10000.0, "Anh", "Manchester United"),
				new Player("Walter Cartwright", "01/01/1990", 1, 10000.0, "Anh", "Manchester United"),
				new Player("Harry Stafford", "01/01/1990", 1, 10000.0, "Anh", "Manchester United"),
				new Player("William Bryant", "01/01/1990", 1, 10000.0, "Anh", "Manchester United"),
				new Player("Frank Barrett", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Jack Peddie", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Sandy Turnbull", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Arthur Lochhead", "01/01/1990", 1, 10000.0, "Scotland", "Manchester United"),
				new Player("Bernd Leno", "01/02/1990", 5, 20000.0, "Anh", "Arsenal"),
				new Player("Héctor Bellerín", "01/02/1990", 5, 20000.0, "Anh", "Arsenal"),
				new Player("Mohamed Elneny", "01/02/1990", 5, 20000.0, "Anh", "Arsenal"),
				new Player("Sokratis Papastathopoulos", "01/02/1990", 5, 20000.0, "Anh", "Arsenal"),
				new Player("Henrikh Mkhitaryan", "01/02/1990", 5, 20000.0, "Anh", "Arsenal")
				);
		
		System.out.println(listPlayer);
		
		System.out.println("The football team has a number of players over 11: ");
		list.stream().forEach(e -> {
			long count = listPlayer.stream().filter(a -> a.getTeamName().equals(e.getTeamName())).count();
			System.out.println((count > 10) ? "Team name = "+ e.getTeamName() + "\nNumber of players = " + count : "");
		});

	}
}
