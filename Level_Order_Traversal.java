class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size() > 0){
            Node temp = q.remove();
            ans.add(temp.data);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return ans;
    }
}
