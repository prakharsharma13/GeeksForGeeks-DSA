class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // If head is null or k is 0, no rotation is needed
        if (head == null || k == 0) return head;

        Node newHead = head, lastNode = head, newHeadPrev = null;

        // Traverse k nodes to find the new head
        while (k-- > 0) {
            newHeadPrev = newHead;
            newHead = newHead.next;
        }

        // If newHead is null, it means k is equal to the length of the list
        if (newHead == null) return head;

        lastNode = newHead;

        // Find the last node
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        // Connect last node to the old head to form a circular list
        lastNode.next = head;

        // Break the link before the new head
        newHeadPrev.next = null;

        return newHead;
    }
}