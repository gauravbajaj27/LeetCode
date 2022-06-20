class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        HashSet<String> hs= new HashSet<>();
        int n=words.length;
        for(int i=0;i<n;i++) hs.add(words[i]);
        
        for(int i=0;i<n;i++){
            
            for(int j=1;j<words[i].length();++j){
                String temp=words[i].substring(j);
                // System.out.println(temp);
                hs.remove(temp);
            }
        }
        
        
        int len=0;
        for(String temp:hs){
            len+=temp.length()+1;
        }
        return len;
        
    }
}

// class Solution {
//     public int minimumLengthEncoding(String[] words) {
//         Set<String> good = new HashSet(Arrays.asList(words));
//         for (String word: words) {
//             for (int k = 1; k < word.length(); ++k){
//                 System.out.println(word.substring(k));
//                 System.out.println(k);
//                 good.remove(word.substring(k));
//             }
//         }

//         int ans = 0;
//         for (String word: good)
//             ans += word.length() + 1;
//         return ans;
//     }
// }