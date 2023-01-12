class Solution {
    long minimizeSum(int n, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =  0 ; i < n ; i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        int sum2 =0;
        while(pq.size()!=1){
            sum = pq.poll()+pq.poll();
            sum2 += sum;
            pq.add(sum);
        }
        return sum2;
    }
}
