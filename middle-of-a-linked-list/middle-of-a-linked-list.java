class Solution {
    int getMiddle(Node head) {
        // Your code here.
        if(head== null) return -1;
    Node temp =head;
    int count=0;
    while(temp!=null){
        temp = temp.next;
        count++;
    }
    temp=head;
    for (int i=0; i<count/2;i++)
    temp= temp.next;
    return temp.data;
}
    
}