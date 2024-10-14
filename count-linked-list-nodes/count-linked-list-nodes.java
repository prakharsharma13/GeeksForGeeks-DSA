class Solution {
    public int getCount(Node head) {
        int count = 1;
        while(head.next != null)
        {
            head=head.next;
            count++;
        }
        return count;
    }
}