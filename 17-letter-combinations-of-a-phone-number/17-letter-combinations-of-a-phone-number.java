class Solution {
    
    
    public List<String> letterCombinations(String s) {
        
        ArrayList<ArrayList<Character>> main = new ArrayList<>();

        char ch1='a';
        char ch2='b';
        char ch3='c';
        char ch4='s';
        char ch5='z';
        for(int i=2;i<=9;i++){
            ArrayList<Character> temp= new ArrayList<>();
            if(i!=7 && i!=9){
                temp.add(ch1);
                temp.add(ch2);
                temp.add(ch3);
                main.add(temp);
                ch1=(char)(ch1+3);
                ch2=(char)(ch2+3);
                ch3=(char)(ch3+3);
            }
            else{
                temp.add(ch1);
                temp.add(ch2);
                temp.add(ch3);
                if(i==7) temp.add(ch4); else temp.add(ch5);
                main.add(temp);
                ch1=(char)(ch1+4);
                ch2=(char)(ch2+4);
                ch3=(char)(ch3+4);
            }
        }
        System.out.println(main);
        List<String> ans = new ArrayList<>();
        if(s.equals("")) return ans;
        int size=s.length();
        
        // for(int i=0;i<size;i++){
            String temp="";
            int num= Integer.parseInt(Character.toString(s.charAt(0)));
            ArrayList<Character> al1=main.get(num-2);
            System.out.println(al1);
            for(int j=0;j<al1.size();j++){
                temp+=al1.get(j);
                System.out.println(al1.get(j)+" 111");
                if(size==1) ans.add(temp);
                if(size>=2){
                    int num2= Integer.parseInt(Character.toString(s.charAt(1)));
                    ArrayList<Character> al2=main.get(num2-2);
                    for(int l=0;l<al2.size();l++){
                        temp+=al2.get(l);
                        System.out.println(al1.get(l)+" 222");
                        if(size==2) ans.add(temp);
                        if(size>=3){
                            int num3= Integer.parseInt(Character.toString(s.charAt(2)));
                            ArrayList<Character> al3=main.get(num3-2);
                            for(int n=0;n<al3.size();n++){
                                temp+=al3.get(n);
                                if(size==3) ans.add(temp);
                                
                                if(size>=4){
                                    int num4=Integer.parseInt(Character.toString(s.charAt(3)));
                                    ArrayList<Character> al4=main.get(num4-2);
                                    for(int p=0;p<al4.size();p++){
                                        temp+=al4.get(p);
                                        if(size==4) ans.add(temp);
                                        temp=temp.substring(0,temp.length()-1);
                                    }
                                }
                                
                        temp=temp.substring(0,temp.length()-1);
                            }
                        }
                        
                        temp=temp.substring(0,temp.length()-1);
                    }
                    
                }
                
                        temp=temp.substring(0,temp.length()-1);
            }
                             
        // }
        
        return ans;
    }
}