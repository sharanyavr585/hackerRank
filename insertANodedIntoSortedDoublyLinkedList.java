/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    if(head==null){
        Node newNode= new Node();
        newNode.data=data;
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
        return head;  
    }
    
    Node current=head;
    Node previous=null;
    Node newNode=new Node();
    newNode.data=data;
   
    //Adding to the start of the linked list
    if (data < current.data){
        newNode.next=current;
        current.prev=newNode; 
        newNode.prev=null;
        head=newNode;
        return head;
    }
    
   
    while(current!=null){
        
        if(current.data>=data){
            previous.next=newNode;
            newNode.prev=previous;
            newNode.next=current;
            current.prev=newNode;
            return head;
            
           }
        previous=current; 
        current=current.next;
         
        
    }
    
   //Adding to the end of linked list
    
    previous.next=newNode;
    newNode.prev=previous;
    newNode.next=null;
    return head;
    
  
}
