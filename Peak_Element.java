public class Peak_Element {

    public int peakElement(int[] arr,int n)
    {
        int max = 0;
        int index =0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                index = i;
                max = arr[i];
            }
        }
        return index;
        //add code here.
    }
}
