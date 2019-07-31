package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FootballListFromHa {
	public static void main(String[] args) {
        String[] teams = {"Chelsea", "Liverpool", "Barcelona", "Manchester"};
        System.out.println("Array: " + Arrays.toString(teams));
        for (String team : teams) {
            String str = team.equals("Manchester") ? "Wowww" : "!!!!!";
            System.out.println(str);
        }

        // option 1
        List lst = Arrays.stream(teams)
                .collect(Collectors.toList()); //Java 8 only

        // option 2
        List lst1 = Arrays.asList(teams); // returns a fixed-size list backed by the specified array.

        // option 3
        List lst2 = new ArrayList<>();
        for (String team : teams) {
            lst2.add(team);
        }

        // option 4
        List lst3 = new ArrayList<>();
        Collections.addAll(lst3, teams);

        System.out.println("lst: " + lst);
        System.out.println("lst1: " + lst1);
        System.out.println("lst2: " + lst2);
        System.out.println("lst3: " + lst3);
    }
}
