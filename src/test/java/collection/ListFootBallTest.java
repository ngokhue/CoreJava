package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFootBallTest {
	public static void main(String[] args) {		
//		1.1
		List<String> footballTeam = new ArrayList<String>();
		footballTeam.add("Tottenham Hotspur");
		footballTeam.add("Paris Saint Germain");
		footballTeam.add("Arsenal");
		footballTeam.add("Chelsea");
		footballTeam.add("Manchester United");
		footballTeam.add("Liverpool");
		footballTeam.add("Manchester City");
		footballTeam.add("Bayern Munich");
		footballTeam.add("Barcelona");

		System.out.println("Các đội bóng gồm: \t");
		for(int i=0; i<footballTeam.size();i++) {
			System.out.println(i+1+". "+footballTeam.get(i));
		}		
		System.out.println("\t");		
		Boolean check = false;	
		for(int i=0;i<footballTeam.size();i++) {
			if(footballTeam.get(i)=="Manchester United")
				check = true;
		}
		if(check==true)
			System.out.println("Wowww \t");
		else 
			System.out.println("!!!!!!!! \t");
		
		Boolean exist = footballTeam.contains("Manchester United");		
		System.out.println(((exist = true) ? "Wowww" : "!!!!!"));
		
		
//		1.2		
		String[] values = {"Dean Henderson","Victor Lindelof","Chris Smalling","Marcos Rojo"};	
		ArrayList<String> footballPlayer = new ArrayList<String>();
		Collections.addAll(footballPlayer, values);
		System.out.println(footballPlayer);
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<values.length;i++) {
			list.add(values[i]);
		}	
		System.out.println(list);
	}

}
