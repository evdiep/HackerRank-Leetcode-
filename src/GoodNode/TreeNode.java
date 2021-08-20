package GoodNode;

public class TreeNode {
	int val; 
	TreeNode left;
	TreeNode right;
	TreeNode(){}
	TreeNode(int val){this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right){
		this.left = left; 
		this.right = right;
		this.val = val;
	}
}
 class Solution{
	 private static int Count_goodNodes(TreeNode root, int max_val, int count) {
		 if(root != null) { 
			 
			 if(max_val < root.val)
				 max_val = root.val;
			 
			 if(root.left!=null) 
				 count= Count_goodNodes(root.left, max_val, count);
			 
			 if(root.right!=null) 
				 count= Count_goodNodes(root.right, max_val, count); 
			 
			 if (root.val >=max_val) {
				 return ++count; 
			 } 
		 }
		 return count;
		 
	 }
	 
	 public static int goodNodes(TreeNode root){
		int count = 0;
		final int root_val = root.val; 
		System.out.println("final root_val number is " + root_val); 
        count = Count_goodNodes(root, root_val, count);
		 
        return count;
    }   
    
    
    
}
