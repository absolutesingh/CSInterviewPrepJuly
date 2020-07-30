package trees;
class BSTNode
{
	int data;
	BSTNode left;
	BSTNode right;
	BSTNode(int data)
	{
		this.data=data;
	}
}
public class BST {
	BSTNode root;//Root for the Binary Search Tree
	BST()
	{
		root=null;
	}
	BST(int data)
	{
		this.root = new BSTNode(data);
	}
	BSTNode search(BSTNode root, int data)
	{
		if(root==null) return null;
		if(root.data==data) return root; //Either equal
		if(data<root.data) //or smaller
		{
			return search(root.left,data);
		}
		else {
			return search(root.right,data);
		}
	}
	boolean searchItr(BSTNode root, int data)
	{
		if(root==null) return false;
		
		while(root!=null)
		{
			if(data==root.data)
			{
				return true;
			}
			else if(data<root.data)
			{
				root=root.left;
			}
			else
			{
				root=root.right;
			}
		}
		return false;
	}
	BSTNode insert(BSTNode root, int data)
	{
		if(root==null) 
		{
			return new BSTNode(data);
		}
		if(data<=root.data)
		{
			root.left = insert(root.left,data); //Insert Data to the left sub tree
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	void preorder(BSTNode root)
	{
		if(root==null) return;
		System.out.print(root.data+" "); //Value
		preorder(root.left); //go to Left Sub Tree
		preorder(root.right); //go to Right Sub Tree
	}
	void inorder(BSTNode root)
	{
		if(root==null) return;
		inorder(root.left); //go to Left Sub Tree
		System.out.print(root.data+" "); //Value
		inorder(root.right); //go to Right Sub Tree
	}
	void postorder(BSTNode root)
	{
		if(root==null) return;
		postorder(root.left); //go to Left Sub Tree
		postorder(root.right); //go to Right Sub Tree
		System.out.print(root.data+" "); //Value
	}
	void getMin(BSTNode root)
	{
		if(root==null) return;
		while(root.left!=null)
		{
			root=root.left;
		}
		System.out.println("Minimum in BST: "+root.data);
	}
	int getMax(BSTNode root)
	{
		if(root==null) return-1;
		while(root.right!=null)
		{
			root=root.right;
		}
		return root.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.root = bst.insert(bst.root,15);//Receive the updated root
		System.out.println(bst.root.data);
		bst.root = bst.insert(bst.root,10);
		bst.root = bst.insert(bst.root,17);
//		System.out.println(bst.root.right.data);
		System.out.println(bst.searchItr(bst.root, 17));
		System.out.println(bst.searchItr(bst.root, 19));
		System.out.println(bst.search(bst.root, 17).data); //Returns BSTNode
		bst.preorder(bst.root);
		System.out.println();
		bst.inorder(bst.root);
		System.out.println();
		bst.postorder(bst.root);
		System.out.println();
		bst.getMin(bst.root);
		System.out.println("Maximum in BST: "+bst.getMax(bst.root));
	}

}
