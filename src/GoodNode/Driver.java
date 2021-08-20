package GoodNode;

public class Driver {
       // implementing driver and test cases, I would keep this in a different file if I was using a different IDE
        public static void main(String args[]){
            TreeNode root = new TreeNode(2);
            //root.left = new TreeNode (4); 
            root.right= new TreeNode(4);
            
        //    root.left.left = new TreeNode (3); 
          //  root.left.right = new TreeNode(2);
            
            root.right.left= new TreeNode (10); 
            root.right.right = new TreeNode(8);
            root.right.right.left = new TreeNode(4);
            
            System.out.print("GoodNodes is: " + Solution.goodNodes(root)); 
	}
}
