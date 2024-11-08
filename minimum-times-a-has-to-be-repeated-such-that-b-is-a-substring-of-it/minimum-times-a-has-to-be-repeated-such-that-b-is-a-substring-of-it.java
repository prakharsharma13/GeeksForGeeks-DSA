class Solution {

    static int minRepeats(String s1, String s2) {

        // code here

        for(char a:s2.toCharArray()){

            String str=String.valueOf(a);

            if(!(s1.contains(str))){

 

                return -1;

            }

        }

        String st="";

        int op=1;

        while(op<500){

            st+=s1;

            if(st.contains(s2)){

                return op;

            }

            op++;

        }

        return -1;

    }

}