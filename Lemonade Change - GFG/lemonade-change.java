//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int fives=0;
        int tens=0;
        int twenties=0;
        boolean ans=true;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                fives++;
            }
            else if(bills[i]==10){
                if(fives>=1){
                    fives--;
                    tens++;
                }
                else{
                    ans=false; break;
                }
            }
            else{
                int pay=0;
                if(tens>=1){
                    tens-=1; pay+=10;
                }
                while(fives>0 && pay!=15){
                    pay+=5; fives--;
                }
                if(pay==15){
                    twenties++;
                }
                else{
                    ans=false; break;
                }
            }
        }
        return ans;
        
    }
}
