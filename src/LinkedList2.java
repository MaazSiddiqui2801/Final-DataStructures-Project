public class LinkedList2 {
    Node head;
    Node tail;
    public void insert(Node d) { //BigO(n)

        if (head == null) {
            head = tail = d;
        }/* else {
            Node curr = head;
            Node prev = head;
            while(curr != null){
                prev = curr;
                curr = curr.next;
            }*/
        else{
            tail.next = d;
            tail = d;
        }

        }

    // code insert data in ascending order }
    public Node[] returnData(){//BigO(n)
        Node[] temp;
        Node curr;

        int count = 0;
         curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        temp = new Node[count];
        int count2 = 0;
        for (curr = head; curr != null ; curr = curr.next) {
            temp[count2] = curr;
            count2++;
        }
        return temp; // return array or linklist?
    } // find the node with value d }
    /*
 public void clear(){//BigO(1)
     head = null;
 }// remove the whole linked list }
 public boolean isEmpty(){//BigO(1)
     boolean empty = false;
     if( head == null)
         empty = true;
     return empty;
  } //return true if linked list is empty }

 public int length(){//BigO(n)
     int count = 0;
     if(head == null)
         return count;
     else {
         for (Node curr  = head; curr != null ; curr = curr.next) {
             count++;
         }
         return count;
     }
 } // return the number of nodes in the list length is zero for the empty list }
    // find the node with value d and remove that node }
    public void remove(int d){ //BigO(n)
 if(head.data == d){
     head = head.next;
 }
 else {
     Node curr = head;
     Node prev = head;
    for ( curr = head; curr != null; curr = curr.next) {
         if(curr.data == d){
             break;
         }
     prev = curr;
     }
    if(curr != null)
    prev.next = curr.next;
    else
         System.out.println("Value enter does not exist");
 }
 }
 public void addAll(LinkedList l) { //BigO(n)
     if( isEmpty()){
         System.out.println("Current list is empty");
     }
     else {
         Node curr = head;
         while(curr.next != null){
             curr = curr.next;
         }
         curr.next = l.head;
         head = curr;
     }
 } //appends the list l to the end of the current list, if the current list is
//nonempty, or lets the head of the current list point to the first element
//of l if the current list is empty.
 public void reverse() {//BigO(n)
     Node pointer = head;
     Node previous = null, current = null;

     while (pointer != null) {
         current = pointer;
         pointer = pointer.next;

         // reverse the link
         current.next = previous;
         previous = current;
         head = current;
     }
 }*/ // reverses the linked list by updating the references or rearrange the nodes
//to reverse the list;
 /*public String toString() { //BigO(n)             // print the list as comma separated values }
     String str = "";
     for (Node curr = head; curr != null; curr = curr.next)
         str = str + curr.data + ",";
     return str;
 }*/
}
