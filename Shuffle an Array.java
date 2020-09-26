class Solution {
    Random rd;
    private int[] nums;
    public Solution(int[] nums) {
        rd = new Random();
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] temp = new int[nums.length];
        boolean[] visited = new boolean[nums.length];
        int i = 0;
        while(i < temp.length){
            int j = rd.nextInt(temp.length);
            if(!visited[j]){
                temp[j] = nums[i];
                i++;
                visited[j] = true;
            }
            else continue;
        }
        return temp;
    }
}
