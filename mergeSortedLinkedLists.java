/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  } 
       
*/  
     

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission.    
     // You only need to complete this method 
    
    if(headA==null && headB==null){
        return headA;
    }
    if(headA==null && headB!=null){
        return headB;
    }
    if(headA!=null && headB==null){
        return headA;
    }
                                    
    Node head=null;               
                                  
    Node current=null;
    
    if(headA.data<headB.data){
        head=headA;
        headA=headA.next;
    }
    else if(headB.data<headA.data){      
        head=headB;
        headB=headB.next;
    }
    current=head;
    Node currentA=headA;
    Node currentB=headB;
    
    while(currentA!=null && currentB!=null ){
        if(currentA.data<=currentB.data){
            current.next=currentA;
            currentA=currentA.next;
            current=current.next;
        }
        else{
            current.next=currentB;
            currentB=currentB.next;
            current=current.next;
        }
    }
    while(currentA!=null){
        current.next=currentA;
        currentA=currentA.next;
        current=current.next;
     }
    while(currentB!=null){
        current.next=currentB;
        currentB=currentB.next;
        current=current.next;
     }
    current.next=null;
    
    return head;
    
}
