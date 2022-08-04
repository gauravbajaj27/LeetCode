class Solution {
    public int mirrorReflection(int p, int q) {
        int extension = q;
        int reflection = p;
        
        while(extension % 2 == 0 && reflection % 2 == 0){
            extension /=2;
            reflection /= 2;
        }
        
        //using our observations here
        if(extension % 2 == 0 && reflection % 2 != 0){
            return 0;
        }
         if(extension % 2 != 0 && reflection % 2 == 0){
            return 2;
        }
         if(extension % 2 != 0 && reflection % 2 != 0){
            return 1;
        }
        return -1;
    }
}