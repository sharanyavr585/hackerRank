/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  if(head==null){
      return head;
  }
  else{
      Node current=head;
      Node previous=null;
      int count=0;
      while(count<position){
          previous=current;
          current=current.next;
          count++;
      }
      if(previous!=null){
         previous.next=current.next;
         
          return head;
      }
      else{
          current=current.next;
          head=current;
          return head;
      }
     
          
  }

}
