import java.util.Random;

public class HashingDemo {


}
class HashTable1 {
    int[] Table;

    int numofCollisions = 0;
    HashTable1(int s){

        int size=s+(s/3);
        int newSize = getPrime(size);

        Table=new int [newSize];
    }
    private int getPrime(int n) {
        while(true) {
            if (isPrime(n)) return n;
            n++;
        }
    }
    private boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public int Hash(int key){

        return key % Table.length;
    }
    public int Rehash(int key, int i){

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
    public void insert(int key){
        int i = Hash(key);
        if(Table[i] == 0){
            Table[i] = key;
        }
        else{
            int j = Rehash(key, i);
            Table[j] = key;

        }
    }

    public boolean search(int key){
        int i =0;
        int k = Hash(key);
        while(Table[k] != 0 && i < Table.length-1 ){
            if(Table[key] == 0){
                return true;
            }
            else{
                Rehash(key, k);
            }
            i++;
        }
        return false;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < Table.length; i++){
            str = str + "[" + i + "]" + Table[i] + "\n";
        }
        return str;
    }
}
