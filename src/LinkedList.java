
public class LinkedList {
    Node head;
 public void insert(Node d) { //BigO(n)

     if (head == null) {
         head = d;
     } else {
         Node curr = head;
         Node prev = head;
         for (curr = head; curr != null; curr = curr.next) {
             prev = curr;
         }
         prev.next = d;
     }
 }
  // code insert data in ascending order }
 public Node[] returnData(){//BigO(n)
     Node[] temp;
     Node curr;

     int count = 0;
     for (curr = head; curr != null ; curr = curr.next) {
         count++;
         }
     temp = new Node[count];
     int count2 = 0;
     for (curr = head; curr != null ; curr = curr.next) {
         temp[count2] = curr;
         count2++;
     }
     return temp;
 }
}
