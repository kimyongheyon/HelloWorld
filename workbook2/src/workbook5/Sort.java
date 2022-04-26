package workbook5;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {

		
		//내림차순 정렬
		Integer arr[] = {4,23,33,15,17,19};
		Arrays.sort( arr,Collections.reverseOrder());
		
		for(int i : arr) {
			System.out.println("["+i+"]");
		}
		
		
		//오름차순 정렬
		  int arr1[] = {4,23,33,15,17,19};
	        Arrays.sort(arr1);
	        
	        for (int i : arr1) {
	            System.out.print("["+i+"]");
	        }
		
	}

}
