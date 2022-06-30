package array_assignment;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class RemoveElement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. declaring array
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int index_value = 6;  //the index value or the element that we want to remove
		
		arr = ArrayUtils.removeElement(arr, index_value);
		System.out.println(Arrays.toString(arr));

	}

}


/* remove index element from array
 */
