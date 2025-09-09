class Remov_element {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for ( int f = 0 ; f < nums.length ; f++){
            if(nums[f] != val){
                
                nums[slow] = nums[f];
                slow++;
                
            }
        }
        return slow;
        
    }
}

