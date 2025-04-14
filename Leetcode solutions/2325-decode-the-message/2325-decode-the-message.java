class Solution {
    public String decodeMessage(String key, String message) {
         List<Character> list=new ArrayList<>();
         for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(list.contains(ch)||ch==' '){ //to check whether the char are repeated
                continue;
            }
            else{
                list.add(ch);
            }
         }
         String res="";
         for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch!=' '){
                int val=list.indexOf(ch); //index in list(key)
                char c=(char)('a'+val); //add the ascii values to get the position
                res+=c;
            }else{
                res+=" ";//if space is there leave space
            }
         }
         return res;
    }
}        
