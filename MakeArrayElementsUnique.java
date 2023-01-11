class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        if(N == 0){
            return 0;
        }
        int count = 0;
        Arrays.sort(arr);
        for(int i = 1 ; i < N ; i++){
            if(arr[i-1] >= arr[i]){
                count = count+(arr[i-1]-arr[i]+1);
                arr[i] = arr[i-1]+1;
            }
        }
        return count;
    }
}
