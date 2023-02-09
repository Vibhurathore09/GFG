
class Solution
{
    static class Pair{
        int hd ;
        Node node;
        Pair(Node node , int hd){
            this.hd = hd;
            this.node = node;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Map<Integer , Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root , 0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd) == null){
                map.put(hd , temp.data);
            }
            if(temp.left != null){
                q.add(new Pair(temp.left , hd -1));
                
            }
            if(temp.right != null){
                q.add(new Pair(temp.right , hd + 1));
            }
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
