package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search
{

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(int[] arr, int target) {
		
		return search(arr,target, 0, arr.length);

	}
	
	public int search (int [] arr, int target, int min, int max){
		if (max <min){
			return -1;
		}
		
		int mid = (min + max)/2;
		
		if(arr[mid]== target){
			return mid; 
		}
		if (arr[mid] < target){
			return search (arr, target, min, mid-1);
		}
		else return search (arr, target, mid+1, max);
	}

}
