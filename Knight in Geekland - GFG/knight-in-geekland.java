//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            s = br.readLine().trim().split(" ");

            int start_x = Integer.parseInt(s[0]);
            int start_y = Integer.parseInt(s[1]);
            int arr[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    arr[i][j] = Integer.parseInt(s[j]);
            }

            Solution soln = new Solution();
            ot.println(soln.knightInGeekland(arr, start_x, start_y));
            
        }

        ot.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int knightInGeekland(int arr[][], int start_x, int start_y){
        int n=arr.length;
        int m=arr[0].length;
        
        boolean[][] vis= new boolean[n][m];
        for(boolean[] a:vis) Arrays.fill(a,false);
        Queue<int[]> que= new LinkedList<>();
        int[] temp= new int[2];
        temp[0]=start_x; temp[1]=start_y;
        que.add(temp);
        vis[temp[0]][temp[1]]=true;
        
        ArrayList<Integer> list= new ArrayList<>();
        int[] x={2,2,-2,-2,1,1,-1,-1};
        int[] y={-1,1,1,-1,2,-2,2,-2};
        while(que.isEmpty()==false){
            Queue<int[]> que2= new LinkedList<>();
            int ans_step=0;
            // System.out.println(que.size()+" sizhaskdfhjkahs");
            while(que.isEmpty()==false){
                int[] temp2=que.poll();
                ans_step+=arr[temp2[0]][temp2[1]];
               
                for(int i=0;i<8;i++){
                    int new_x=temp2[0]+x[i];
                    int new_y=temp2[1]+y[i];
                    
                    if(new_x<n && new_y<m && new_x>=0 && new_y>=0 && vis[new_x][new_y]==false){
                        int[] temp3= new int[2];
                        temp3[0]=new_x; temp3[1]=new_y; que2.add(temp3);
                         vis[new_x][new_y]=true;
                         
                    // System.out.println(new_x+" "+new_y+" values new");
                    }
                }
                
                // System.out.println(que);
            }
            list.add(ans_step);
                // System.out.println(list);
                que=que2;
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        // System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)+i<list.size()){
                list.set(i, list.get(i)+list.get(list.get(i)+i));
            }
            if(list.get(i)>=max) {max=list.get(i); ans=i;}
            // System.out.println(ans)
        }
        // System.out.println(list);
        return ans;
        
        
        
    }
}   
