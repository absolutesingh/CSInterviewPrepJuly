package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		arr[0] = new int[]{1,2,3,4};
		arr[1] = new int[3];
		arr[2] = new int[] {8,9,10,11};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
