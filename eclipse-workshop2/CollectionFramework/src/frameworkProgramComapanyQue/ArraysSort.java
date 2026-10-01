package frameworkProgramComapanyQue;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysSort {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(50);
		list.add(2);
		System.out.println("element: " +list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
