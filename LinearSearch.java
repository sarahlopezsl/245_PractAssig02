package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(int[] arr, int target) {
		
		int location = -1;
		
		for(int i = 0; i < arr.length; i++){
			if (arr[i]== target){
				location = i; 
			} 
		}
		return location;
	}

}
