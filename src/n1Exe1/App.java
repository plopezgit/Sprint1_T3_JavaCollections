package n1Exe1;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Month> monthList = new ArrayList<Month>();
		
		monthList.add(new Month ("January"));
		monthList.add(new Month ("February"));
		monthList.add(new Month ("March"));
		monthList.add(new Month ("April"));
		monthList.add(new Month ("May"));
		monthList.add(new Month ("June"));
		monthList.add(new Month ("July"));
		monthList.add(new Month ("September"));
		monthList.add(new Month ("October"));
		monthList.add(new Month ("November"));
		monthList.add(new Month ("December"));
		
		for (Month m : monthList) {
			System.out.println(m);
		}
		
		monthList.add(7, new Month ("August"));
				
		Iterator<Month> iterator = monthList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		HashSet<Month> monthList2 = new HashSet<Month>();
		
		monthList2.add(new Month ("January"));
		monthList2.add(new Month ("February"));
		monthList2.add(new Month ("March"));
		monthList2.add(new Month ("April"));
		monthList2.add(new Month ("May"));
		monthList2.add(new Month ("June"));
		monthList2.add(new Month ("July"));
		monthList2.add(new Month ("August"));
		monthList2.add(new Month ("August")); //Attempt to repete is controlled 
		monthList2.add(new Month ("September"));
		monthList2.add(new Month ("October"));
		monthList2.add(new Month ("November"));
		monthList2.add(new Month ("December"));
		
		for (Month m : monthList2) {
			System.out.println(m + " | Code: " + m.hashCode());
		}
				
		Iterator<Month> iterator2 = monthList2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		monthList.add(7, new Month ("August")); //Attemp to repete passes
		
		for (Month m : monthList) {
			System.out.println(m);
		}

	}

}
