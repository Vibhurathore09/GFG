class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(isSum(root)){
            return 1;
        }else{
            return 0;
        }
        
    }
    static boolean isSum(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left!= null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum += root.right.data;
        }
        return (root.data == sum && isSum(root.left) && isSum(root.right)); 
    }
}
