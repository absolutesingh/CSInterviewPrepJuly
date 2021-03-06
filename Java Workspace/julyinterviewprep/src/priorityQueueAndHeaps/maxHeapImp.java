package priorityQueueAndHeaps;
class MaxHeap
{
	final int capacity = 10; //Size of array
	int arr[] = new int[capacity];
	int size = 0; //number of items at any particular time
	//Functions to get indexes
	int getParentIndex(int i)
	{
		return (i-1)/2;
	}
	int getLeftChildIndex(int i)
	{
		return 2*i+1;
	}
	int getRightChildIndex(int i)
	{
		return 2*i+2;
	}
	//Function to get Value of Parent/Children
	int parent(int i)
	{
		return arr[getParentIndex(i)];
	}
	int leftChild(int i)
	{
		return arr[getLeftChildIndex(i)];
	}
	int rightChild(int i)
	{
		return arr[getRightChildIndex(i)];
	}
	//Check if the parent/children exist
	boolean hasParent(int i)
	{
		return getParentIndex(i)>=0;
	}
	boolean hasLeftChild(int i)
	{
		return getLeftChildIndex(i)<size;
	}
	boolean hasRightChild(int i)
	{
		return getRightChildIndex(i)<size;
	}
	int peek()
	{
		if(size==0)
		{
			System.out.println("Nothing in Heap");
			return -1;
		}
		return arr[0];
	}
	//Insertion in heap
	void add(int data)
	{
		arr[size] = data;
		size++;
		heapifyUp();
	}
	void heapifyUp()
	{
		int index = size - 1;
		while(hasParent(index) && parent(index)<arr[index])
		{
			swap(getParentIndex(index),index);
			index = getParentIndex(index); // Ab hamari value parent ki jagah pe chali gayi
			
		}
	}
	void swap(int index1, int index2) //Using indexes swap the values in array
	{
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	//Deletion from Heap
	int poll()
	{
		int element = arr[0];
		arr[0]=arr[size-1];
//		arr[size-1] = element; Will help you in your HW
		size--;
		heapifyDown();
		return element;
	}
	void heapifyDown()
	{
		int index = 0;
		while(hasLeftChild(index)) //Jab tak koi bhi ek child ho tab tak
		{
			int largerChildIndex = getLeftChildIndex(index);
			//Agar right child hai, aur left se bada hai to
			if(hasRightChild(index) && rightChild(index)>leftChild(index))
			{
				largerChildIndex = getRightChildIndex(index);
			}
			//We have the larger child
			if(arr[index]>arr[largerChildIndex])
			{
				break; //or return;
			}
			else {
				swap(index,largerChildIndex);
			}
			index = largerChildIndex; //Ab hamari value bade vale child ki position pe padi hai
		}
	}
}
public class maxHeapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap heap = new MaxHeap();
		heap.add(7);
		System.out.println(heap.peek());
		heap.add(10);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		System.out.println(heap.peek());
		System.out.println(heap.poll());
		System.out.println(heap.peek());
	}

}
