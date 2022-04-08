class KthLargest {
    int kEle=0;
    ArrayList<Integer> al;
    int num=0;
    public KthLargest(int k, int[] nums) {
        al= new ArrayList<>();
        for(int i=0;i<nums.length;i++) al.add(nums[i]);
        Collections.sort(al);
        num=k;
    }
    
    public int add(int val) {
        al.add(val);
        // System.out.println(al);
        Collections.sort(al);
        // Sytem.out.println(num);
        return al.get(al.size()-num);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */