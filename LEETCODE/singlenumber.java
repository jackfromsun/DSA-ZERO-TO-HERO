//single number
static int single(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1] ){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

//singlenumber ll
static int single(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=3){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i+3]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
