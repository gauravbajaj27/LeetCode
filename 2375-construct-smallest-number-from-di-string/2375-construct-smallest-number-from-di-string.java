class Solution {
    
    public static void reverse(int[] arr, int l, int r){
        if(r==arr.length) r--;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++; r--;
        }
        
    }
    
    public String smallestNumber(String pattern) {
        
        int len=pattern.length();
        
        if(pattern.charAt(len-1)=='I') pattern+='I';
        else pattern+='D';
        len++;
        
        
        int[] arr= new int[len];
        
        for(int i=0;i<len;i++){
            arr[i]=i+1;
        }
        
        
        int index=0;
        
        while(index<len){
            // System.out.println(len+" LEN");
            // for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
            // System.out.println();
            int temp=index;
            
            while(index<(len) && pattern.charAt(index)=='D') index++;
            
            // System.out.println(index+" LOOP");
            
            if((index-temp)>=1){
                reverse(arr,temp,index);
            }
            
            index++;
            
        }
        
        String s="";
        for(int i=0;i<len;i++){
            s+=Integer.toString(arr[i]);
        }
        return s;
    }
}