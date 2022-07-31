class NumArray {
    public static int[] arr;
    public static int n;
    public NumArray(int[] nums) {
        n=nums.length;
        arr= new int[n*2];
        buildTree(nums);
    }
    
    public static void buildTree(int[] nums){
        int j=0;
        for(int i=n;i<2*n;i++){
            arr[i]=nums[j]; j++;
        }
        
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i*2]+arr[(i*2)+1];
        }
        
    }
    
    
    public void update(int index, int val) {
        index+=n;
        arr[index]=val;
        while(index>0){
            int left=index;int right=index;
            if(index%2==0) right=index+1;
            else left=index-1;
            arr[index/2]=arr[left]+arr[right];
            index/=2;
        }
    }
    
    public int sumRange(int left, int right) {
        left+=n; right+=n;
        int sum=0;
        while(left<=right){
            if(left%2==1){
                sum+=arr[left]; left++;
            }
            if(right%2==0){
                sum+=arr[right]; right--;
            }
            left/=2;
            right/=2;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */