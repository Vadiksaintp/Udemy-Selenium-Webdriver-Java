package Section07;

import java.util.ArrayList;
import java.util.List;

public class L19_List {
	
	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Lizard");
		animals.remove(0);
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
	}
	
}