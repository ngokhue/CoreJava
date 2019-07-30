package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFootBallTest {
	public static void main(String[] args) {
//		1.1
		List<String> footballTeams = new ArrayList<String>();
		footballTeams.add("Tottenham Hotspur");
		footballTeams.add("Paris Saint Germain");
		footballTeams.add("Arsenal");
		footballTeams.add("Chelsea");
		footballTeams.add("Manchester United");
		footballTeams.add("Liverpool");
		footballTeams.add("Manchester City");
		footballTeams.add("Bayern Munich");
		footballTeams.add("Barcelona");

		System.out.println("Các đội bóng gồm:");
		int size = footballTeams.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i + 1 + ". " + footballTeams.get(i));
		}

//		C1
		Boolean check = false;
		for (int i = 0; i < size; i++) {
//			if(footballTeams.get(i)=="Manchester United")
			if ("Manchester United".equals(footballTeams.get(i)))
				check = true;
		}
		System.out.println((check=true)?"Wowwwwwww": "!!!!!!!!!!!!!!");
		
//		C2
		for (String team : footballTeams) {
            String str = team.equals("Manchester United") ? "Wowwwww" : "!!!!!!!";
            System.out.println(str);
        }

//		C3
		Boolean exist = footballTeams.contains("Manchester United");
		System.out.println(((exist = true) ? "Wowww" : "!!!!!"));

//		1.2		
		String[] values = { "Dean Henderson", "Victor Lindelof", "Chris Smalling", "Marcos Rojo" };
		ArrayList<String> footballPlayer = new ArrayList<String>();
		Collections.addAll(footballPlayer, values);
		System.out.println(footballPlayer);

		ArrayList<String> list = new ArrayList<String>();
		int length = values.length;
		for (int i = 0; i < length; i++) {
			list.add(values[i]);
		}
		System.out.println(list);
	}

}
