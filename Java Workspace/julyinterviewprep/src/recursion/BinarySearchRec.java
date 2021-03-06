package recursion;

public class BinarySearchRec {
	static int binarySearch(int arr[],int l,int r, int x) //Returning the index
	{
		if(l>r) return -1;
		int mid = (l+r)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(x>arr[mid])
		{
			return binarySearch(arr,mid+1,r,x);
		}
		else {
			return binarySearch(arr,l,mid-1,x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,10,15,30,40};
		int x = 30;
		System.out.println(binarySearch(arr,0,arr.length-1,x));
	}

}
