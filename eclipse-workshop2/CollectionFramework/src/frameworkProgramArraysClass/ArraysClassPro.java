package frameworkProgramArraysClass;

import java.util.Arrays;

public class ArraysClassPro {
	public static void main(String []args) {
		int[] numbers = {1,4,3,2,5};
		int index = Arrays.binarySearch(numbers, 5);
		
		System.out.println(index);
		
		
	}

}
