class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[]  arr= new int[m+n];
        
        int index1=0;
        int index2=0;
        int index=0;
        while(index1<m && index2<n){
            if(nums1[index1]<=nums2[index2]){
                arr[index++]=nums1[index1++];
            }
            else arr[index++]=nums2[index2++];
        }
        
        while(index1<m){
            arr[index++]=nums1[index1++];
        }
        while(index2<n){
            arr[index++]=nums2[index2++];
        }
        
        // for(int i=0;i<m+n;i++) System.out.print(arr[i]);
        
        for(int i=0;i<m+n;i++) nums1[i]=arr[i];
        
        
    }
}