public class HashTable_Seprate_Chaining {
    
    Node_Hashtable[] arr = new Node_Hashtable[5];
    LinkedList ll = new LinkedList();


    public void buildHash()
    {

        Node_Hashtable x = new Node_Hashtable("Balochistan", ll.getNumD("Balochistan") );
        arr[0] = x;
        
        x = new Node_Hashtable("Sindh",ll.getNumD("Sindh"));
        arr[1] = x;
        
        x = new Node_Hashtable("Punjab",ll.getNumD("Punjab"));
        arr[2] = x;
        
        x = new Node_Hashtable("KP",ll.getNumD("KP"));
        arr[3] = x;
        
        x = new Node_Hashtable("FATA",ll.getNumD("FATA"));
        arr[4] = x;
        
    }
    
    public void insert(String Province,String District,String UorR,String Sex, String SEC,String AgeGroup,int Population)
    {
       int key = Hash(Province);
       arr[key].Chain.insert(Province, District, UorR,Sex,SEC, AgeGroup, Population);
    }
    
    public int Hash(String Province)
    {
        char x = Province.charAt(0);
        int key = 0;
        switch(x)
        {
            case 'B':
                key = 0;
                break;
            case 'S':
                key = 1;
                break;
            case 'P':
                key = 2;
                break;
            case 'K':
                key = 3;
                break;
            case 'F':
                key = 4;
                break;
             
        }
        return key;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str = str + "[" + i + "] " + [i] + "\n";
        }
        return str;
    }
    
}
