class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long max1=horizontalCuts[0]-0;
        long max2=verticalCuts[0]-0;
        
        int n=horizontalCuts.length;
        int m=verticalCuts.length;
        
        for(int i=1;i<n;i++){
            max1=Math.max(max1,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        for(int i=1;i<m;i++){
            max2=Math.max(max2,verticalCuts[i]-verticalCuts[i-1]);
        }
        
        
        max1=Math.max(max1,h-horizontalCuts[n-1]);
        
        max2=Math.max(max2,w-verticalCuts[m-1]);
        
        // System.out.println(max1+" "+max2);
        
        long ans=((max1%1000000007)*(max2%1000000007 ))% 1000000007;
        // System.out.println(ans);
        return (int) ans;
        
    }
}