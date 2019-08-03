package collection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FootballTeam {
	private String teamName, teamManager;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamLeader() {
		return teamManager;
	}

	public void setTeamLeader(String teamLeader) {
		this.teamManager = teamLeader;
	}

	public FootballTeam(String teamName, String teamLeader) {
		this.teamName = teamName;
		this.teamManager = teamLeader;
	}

	@Override
	public String toString() {
		return "Team name = " + teamName + ", team leader = " + teamManager;
	}

	public static void main(String[] args) throws IOException {
//		List<FootballTeam> list = Arrays.asList(new FootballTeam("abc", "def"), new FootballTeam("ghk", "dml"));
//		System.out.println(list);
//		list.stream().filter(a -> ((FootballTeam) a).getTeamLeader().startsWith("d"))
//				.forEach(b -> System.out.println("s11111111"));

		String input = " FootballClubs.txt";
		ArrayList<FootballTeam> footballTeams = new ArrayList<FootballTeam>();

		try (Stream<String> stream = Files.lines(Paths.get(input), StandardCharsets.UTF_8)) {
			stream.filter(a -> a.substring(a.indexOf("\t") + 1).startsWith("John")).forEach(line -> {
				footballTeams.add(new FootballTeam(line.substring(0, line.indexOf("\t")),
						line.substring(line.indexOf("\t") + 1)));
			});

		} catch (IOException e) {
			e.printStackTrace();
		}		

		FileOutputStream fo = new FileOutputStream("FootballJohn.txt");
        PrintWriter out = new PrintWriter(fo);
        out.print(footballTeams);
        out.close();		
	}
}
