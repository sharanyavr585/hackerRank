/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.   
 if (head==null){                            
     return null;                                    
 }                                                  
 else{                               
     
     Node current=head;
     Node head1=head.next;
     Node current1=head1;
    
     
     
     while(current1!=null){
         if(current1.data!=current.data){
             current.next=current1;
             current=current.next;
             current1=current1.next;
         }
         else{
         current1=current1.next;
         }   
     }
     current.next=null;
     return head;
 }   
}
