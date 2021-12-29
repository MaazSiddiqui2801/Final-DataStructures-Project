class HashTable {
    LinkedList[] Table;


    HashTable(int s) {

        int size = s + (s / 3);
        int newSize = getPrime(size);

        Table = new LinkedList[newSize];
        for (int i = 0; i < newSize; i++) {
            Table[i] = new LinkedList();
        }
    }

    private int getPrime(int n) {
        while (true) {
            if (isPrime(n)) return n;
            n++;
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int Initial_Hash(Node key) {
        String x = key.Province;
        int i = -1;
        switch (x) {
            case "Balochistan":
                i = 0;
                break;
            case "Sindh":
                i = 1;
                break;
            case "Punjab":
                i = 2;
                break;
            case "KP":
                i = 3;
                break;
            case "FATA":
                i = 4;
                break;


        }
        return i % 5; //5 is the number of Province.
    }

    public int Initial_Hash(String key) {
        char x = key.charAt(0);
        int i = -1;
        switch (x) {
            case 'B':
                i = 0;
                break;
            case 'S':
                i = 1;
                break;
            case 'P':
                i = 2;
                break;
            case 'K':
                i = 3;
                break;
            case 'F':
                i = 4;
                break;


        }
        return i % 5; //5 is the number of Province.
    }

    /*public int Rehash(Node key){

        numofCollisions++;

        while(true){
            for(int j = 0; j < Table.length; j++){
                int k = (i + (j*j)) % Table.length;
                if(Table[k] == 0){
                    return k;

                }
                else
                    numofCollisions++;
            }
        }

    }
*/

    public Node[] search(String value) {

        int x = Initial_Hash(value);
        return Table[x].returnData();
    }

    public void insert(Node key) {
        int i = Initial_Hash(key);
        Table[i].insert(key);
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < Table.length; i++) {
            str = str + "[" + i + "]" + Table[i] + "\n";
        }
        return str;
    }
}
