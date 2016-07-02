/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method.
    
      
   int count=0;
   Node current=head; 
   while(current!=null){
       count++;
       current=current.next;
   }
   int diff=count-n;
   count=1;
   current=head; 
   while(count<diff){
      current=current.next;
      count++;    
   } 
   return current.data;



}
