package frameworkProgramList;

import java.util.*;

public class MinMaxFreList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(44);
		list.add(4);
		list.add(55);
		list.add(22);
		list.add(1);
		list.add(44);
		list.add(44);
		
		System.out.println("Min Element: "+Collections.min(list));
		System.out.println("Max Element: "+Collections.max(list));
		System.out.println("Frequency Of Element: "+Collections.frequency(list, 44));
	}
	

}
