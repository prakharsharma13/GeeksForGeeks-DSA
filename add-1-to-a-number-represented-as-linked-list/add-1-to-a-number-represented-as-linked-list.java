class Solution {
    public Node addOne(Node head) {
        // Step 1: Reverse the linked list
        Node temp = reverse(head);
        
        Node ans = null; // Result list's head
        Node node = null; // Current node in the result list
        
        int carry = 1; // We start with a carry of 1 (adding 1)
        
        while (temp != null) {
            int sum = temp.data + (carry ==1 ? 1 : 0); // Add carry if it's true
            carry = sum / 10; // Determine if there's a carry for the next digit
            sum = sum % 10; // Current node's value
            
            // Create a new node with the sum
            Node newNode = new Node(sum);
            
            // If it's the first node, initialize ans and node
            if (ans == null) {
                ans = newNode;
                node = newNode;
            } else {
                node.next = newNode;
                node = node.next;
            }
            
            temp = temp.next;
        }
        
        // If there's still a carry after processing all nodes, add a new node with value 1
        if (carry==1) {
            node.next = new Node(1);
        }
        
        // Step 2: Reverse the list back to the original order
        Node fans = reverse(ans);
        return fans;
    }

    // Reverse the linked list
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node sec = curr.next;
            curr.next = prev;
            prev = curr;
            curr = sec;
        }
        return prev;
    }
}