public class LinkedList {
    
    Node_LinkedList Head;
    Node_LinkedList Tail;
    
    public void insert(String Province,String District,String UorR,String Sex, String SEC,String AgeGroup,int Population)
    {
        Node_LinkedList temp = new Node_LinkedList( Province, District, UorR,Sex, SEC, AgeGroup, Population);
        if(Head == null)
        {
            Head = Tail = temp;
        }
        else
        {
            Tail.next = temp;
            Tail = temp;
        }

    }

    public int getNumD(String a)
    {
        Node_LinkedList temp = Head;
        int i = 0;

        while(temp!= null){
            if(temp.Province.equals(a)){
                i++;
            }
            temp = temp.next;
        }
        return i;


    }
}
