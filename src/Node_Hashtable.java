public class Node_Hashtable {
    
    String key;
    LinkedList Chain;
    String [] hash;


    
    public Node_Hashtable(String key, int i)
    {
        this.key = key;
        Chain = new LinkedList();
        this.hash= new String[i] ;
    }


    public Node_Hashtable(String value, String value1, String value2, String value3, String value4, String value5, String value6) {
    }
}
