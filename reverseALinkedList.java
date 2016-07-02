/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    
    if (head==null){
        return head;
    }
    else{
        Node current=head;
        Stack<Node> st = new Stack<Node>();
        while(current.next!=null){
            st.push(current);
            current=current.next;
        }
        head=current;
        while(!st.empty()){
            Node temp=st.pop();
            current.next=temp;
            current=temp;
        }
        
        current.next=null;
        
        return head;
        
                   
        
    }

}
