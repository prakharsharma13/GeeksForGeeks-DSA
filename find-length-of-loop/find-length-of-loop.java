class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        int ptr = 0;
        HashMap<Node,Integer> map = new HashMap<>();
        while(head != null){
            if(map.containsKey(head)){
                return ptr - map.get(head);
            }else{
                map.put(head,ptr++);
                head = head.next;
            }
        }
        return 0;
    }
}