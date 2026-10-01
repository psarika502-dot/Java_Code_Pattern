package frameworkProgramArraysClass;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {
	Integer[] numbers = {3,2,1,4,6};
	
	Arrays.sort(numbers);
	
	for(int i : numbers) {
		System.out.print(i+" ");
	}
	}

}
