package week3Javabasics;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};		//7
		int n=data.length;
		Arrays.sort(data);
System.out.println("second largest number is "+ data[n-2]);
	}

}
