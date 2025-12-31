class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++)
        {
            sum=sum+apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=capacity.length-1;i>=0;i--)
        {
            sum=sum-capacity[i];
            count++;
            if(sum<=0)
                return count;
        //    System.out.print(capacity[i]);
        }
        return count;
    }
}