class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head==null||head.next==null) return ;
        Node curr=head;
        // Node prev=head;
        while(curr!=null&&curr.next!=null){
            Node temp=curr.next.next;
            curr.next=curr.next.next;
            curr=temp;
        }
    }
}