class FreqStack {
    
    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> freqGrp;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap<>();
        freqGrp= new HashMap<>();
        maxFreq=0;
    }
    
    public void push(int val) {
        if(freq.containsKey(val)) freq.put(val,freq.get(val)+1);
        else freq.put(val,1);
        
        int temp=freq.get(val);
        if(temp>maxFreq){
            maxFreq=temp;
        }
        
        if(freqGrp.containsKey(temp)){
            freqGrp.get(temp).push(val);
        }
        else{
            Stack<Integer> st = new Stack<>();
            st.push(val);
            freqGrp.put(temp,st);
        }
    }
    
    public int pop() {
        // System.out.println(freq);
        // System.out.println(freqGrp);
        int ans=freqGrp.get(maxFreq).pop();
        freq.put(ans,freq.get(ans)-1);
        
        if(freqGrp.get(maxFreq).size()==0) maxFreq--;
        return ans;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */