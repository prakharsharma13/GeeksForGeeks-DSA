class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
       Stack<Character>st=new Stack<>();
       
       for(int i=0;i<x.length();i++){
           char ch=x.charAt(i);
           if(st.size()==0){
               st.push(ch);
           }
           else{
               if(ch==')' && st.peek()=='('){
                   st.pop();
               }
               else if(ch==']' && st.peek()=='['){
                   st.pop();
               }
               else if(ch=='}' && st.peek()=='{'){
                   st.pop();
               }
               else{
                   st.push(ch);
               }
           }
       }
       
       
       if(st.size()==0)return true;
       else return false;
    }
}

