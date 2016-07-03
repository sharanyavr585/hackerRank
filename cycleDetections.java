/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:     
    class Node {          
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null || head.next==null)
        return false;
    
    Node current=head.next;
    Node current2=head.next.next;
    
    while(current.next!=null && current2.next!=null && current2.next.next!=null){
        if(current==current2)
            return true;
        current=current.next;
        current2=current2.next.next;
    }
    return false;
}
