//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    public static boolean isValid(int x,int y,int n, int m){
        if(x>=1 && x<=n && y>=1 && y<=m) return true;
        return false;
    }
    
	public static int minIteration(int N, int M, int x, int y){
	    
	    int count=0;
	    boolean[][] arr= new boolean[N+1][M+1];
	    
	    int p=x;
	    int q=y;
	    
	    
	    
	    Queue<Integer> q1= new LinkedList<>();
   	    Queue<Integer> q2= new LinkedList<>();
   	    q1.add(p); q2.add(q);
	    while(q1.isEmpty()==false){
	        int size=q1.size();
	        boolean f=false;
	        
	        while(size-->0){
	            x=q1.poll();
	        y=q2.poll();
	        boolean f1=isValid(x+1,y,N,M);
	        boolean f2=isValid(x-1,y,N,M);
	        boolean f3=isValid(x,y+1,N,M);
	        boolean f4=isValid(x,y-1,N,M);
	        
	        f=false;
	       // System.out.println(f1+" "+f2+" "+f3+" "+f4);
	        if(f1 && arr[x+1][y]==false){
	            f=true;
	            arr[x+1][y]=true;
	            q1.add(x+1);
	            q2.add(y);
	        }
	        
	        if(f2 && arr[x-1][y]==false){
	            f=true;
	            arr[x-1][y]=true;
	            q1.add(x-1); q2.add(y);
	        }
	        
	        if(f3 && arr[x][y+1]==false){
	            f=true;
	            arr[x][y+1]=true;
	            q1.add(x); q2.add(y+1);
	        }
	        
	        if(f4 && arr[x][y-1]==false){
	            f=true;
	            arr[x][y-1]=true;
	            q1.add(x);
	            q2.add(y-1);
	        }
	        
	        
	        }
	        
	       // System.out.println(q1+ " "+q2);
	        if(q1.isEmpty()==false){
	            count++;
	        }
	        else break;
	       // }
	    }
	    return count;
		
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String input[]=read.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);
           	input=read.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.minIteration(N, M, x, y));
        }
        
    }
}
// } Driver Code Ends