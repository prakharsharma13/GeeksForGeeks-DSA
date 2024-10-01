class Solution {
    long e = 1000000007;
    public long multiplyTwoLists(Node first, Node second) {
     
        long sum1 = 0, sum2 = 0; // two variables to get the numbers
        
        while(first != null) // running the while loop until we get null
        {
            sum1 = ((sum1 * 10) + first.data) % e; //getting the first number
            first = first.next; // important to keep changing the pointer
        }
        
        while(second != null) // running the while loop until we get null
        {
            sum2 = ((sum2 * 10) + second.data) % e; //getting the second number
            second = second.next; // important to keep changing the pointer
        }
        
        return (sum1 * sum2 ) % e ;
    }
}

