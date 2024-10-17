class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        Node aList = null;
        Node bList = null;
        
        Node aTail = null;
        Node bTail = null;
        
        Node current = head;
        boolean flag = true;
        
        while(current != null){
            if(flag){
                if(aList == null){
                    aList = current;
                    aTail = aList;
                }
                else{
                    aTail.next = current;
                    aTail = aTail.next;
                }
            }
            else{
                if(bList == null){
                    bList = current;
                    bTail = bList;
                }
                else{
                    bTail.next = current;
                    bTail = bTail.next;
                }
            }
            
            flag = !flag;
            current = current.next;
        }
        
        if(aTail != null){
            aTail.next = null;
        }
        
        if(bTail != null){
            bTail.next = null;
        }
        
        return new Node[] {aList, bList};
    }
}