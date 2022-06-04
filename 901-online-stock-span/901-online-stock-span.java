class StockSpanner {
    
    Stack<int[]> st;
    
    public StockSpanner() {
        st= new Stack<>();
    }
    
    public int next(int price) {
        int cnt = 1;
        while(!st.isEmpty() && st.peek()[1]<=price)
        {
            int[] x=st.pop();
            int temp1=x[0];
            int temp2=x[1];
            cnt+=temp1;
        } 
        int x[] = {cnt,price};
        st.push(x);
        return cnt;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */