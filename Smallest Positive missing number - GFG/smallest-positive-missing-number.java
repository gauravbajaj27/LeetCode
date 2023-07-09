//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                hs.add(arr[i]);
            } 
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int i:hs) al.add(i);
        Collections.sort(al);
        int num=1;
        for(int i=0;i<al.size();i++){
            if(al.get(i)!=num){
                return num;
            }
            else{
                num++;
            }
        }
        // System.out.println(al.get(al.size()-1)+1);
        // return 0;
        if(al.size()>0)return al.get(al.size()-1)+1;
        return 1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends