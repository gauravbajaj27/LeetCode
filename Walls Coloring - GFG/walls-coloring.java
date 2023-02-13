//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			int [][] colors = new int[N][3];
			for(int i = 0; i < N; i++) {
				String [] str = br.readLine().trim().split(" ");
				colors[i][0] = Integer.parseInt(str[0]);
				colors[i][1] = Integer.parseInt(str[1]);
				colors[i][2] = Integer.parseInt(str[2]);
			}
			Solution obj = new Solution();
			out.println(obj.minCost(colors, N));
		}
		out.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minCost(int [][] colors, int n){
        //Write your code here
        
        int[] dp1= new int[n];
        int[] dp2= new int[n];
        int[] dp3= new int[n];
        
        dp1[0]=colors[0][0];
        dp2[0]=colors[0][1];
        dp3[0]=colors[0][2];
        
        
        for(int i=1;i<n;i++){
            dp1[i]=colors[i][0]+Math.min(dp2[i-1],dp3[i-1]);
            dp2[i]=colors[i][1]+Math.min(dp1[i-1],dp3[i-1]);
            dp3[i]=colors[i][2]+Math.min(dp1[i-1],dp2[i-1]);
        }
        
        return Math.min(dp1[n-1], Math.min(dp2[n-1],dp3[n-1]));
        
        
    }
}