import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;


public class database {

    public void databaseDesign(){

        Scanner sc = new Scanner(new File("src/populationData.xlsx"));



        while (sc.hasNextLine())  //returns a boolean value
        {
            String x = sc.nextLine();//find and returns the next complete token from this scanner
            String[] Uni  = x.split(",");
            String[] programs = Uni[1].split("-");

//			System.out.println(programs.length);
            LList.insert(Uni[0], Uni[3], Uni[2], programs,Uni[4]);
//			System.out.println("\nThe Name Of the Uni is = " + Uni[0] + " \nthe programs offered are = " + programs[0] + "," + programs[1] + "," +programs[2] +  "\nCity = " + Uni[2] + "\nCountry = " + Uni[3] );

//			System.out.println("\nThe Name Of the Uni is = " + Uni[0] + " \nthe programs offered are = " + Uni[1] +  "\nCity = " + Uni[2] + "\nCountry = " + Uni[3] );
        }
        sc.close();  //closes the scanner
        // Making 2-d  Array for Province List
        
        String [][]arr = new  String[4][1];
        arr[0][0]= "Sindh";
        arr[1][0]= "Punjab";
        arr[2][0]= "Balochistan";
        arr[3][0]= "KP";//Khyber Pakhtunkhwa
        arr[4][0]= "FATA";// Federally Administrated Tribal Area









    }

    public class HashTable {

        int[] Table;
        int[] TableQaud;

        int numofCollisions = 0;
        int numofCollisionsQaud = 0;
        int numofOccupiedCells = 0;
        int numofOccupiedCellsQaud = 0;

        HashTable(int s) {
            // table size should be a prime number and 1/3 extra.
            int size = s + (s / 3);
            int newSize = getPrime(size);

            Table = new int[newSize]; // if value is 0 for integer the cell will consider empty.
            TableQaud = new int[newSize]; // if value is 0 for integer the cell will consider empty.
        }

        private int getPrime(int n) {
            while (true) {
                if (isPrime(n)) {
                    return n;
                }
                n++;
            }
        }

        private boolean isPrime(int n) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        //compute hash value by taking mod on key value and return remainder
        public int Hash(int key) {
            return (key % Table.length);
        }

        // first test linear probing, then test Quadratic probing and compare both technique on same data with respect to number of collision
        public int Rehash(int key, int i) {

            return ((key + i) % Table.length);
        }

        public int RehashQaud(int key, int i) {

            return ((key + (i*i)) % TableQaud.length);
        }

        public void insertQaud(int key) { // keep maintain 1/3 empty cells

            int index = Hash(key);
            if (TableQaud[index] == 0) {
                TableQaud[index] = key;
                numofOccupiedCellsQaud++;
            }
            else
            {
                numofCollisionsQaud++;
                int i = 1;
                while (i < 11) {        //ASSUMING 10 IS THE THRESHOLD LIMIT OF REHASHES
                    int reIndex = RehashQaud(key, i);
                    if(reIndex>TableQaud.length)
                    {
                        System.out.println("CANNOT BE INSERTED, ARRAY FULL");
                        return;
                    }
                    if (TableQaud[reIndex] == 0) {
                        TableQaud[reIndex] = key;
                        numofOccupiedCellsQaud++;
                        return;
                    } else {
                        i++;
                        numofCollisionsQaud++;
                    }
                }

            }
        }

        public boolean searchQaud(int key) {

            int index = Hash(key);
            if(TableQaud[index]==key)
            {
                return true;
            }
            else
            {
                for(int i=1;i<11;i++) //THRESHOLD LIMIT IS 10 ASSUMING
                {
                    int reIndex = RehashQaud(key, i);
                    if(TableQaud[reIndex]==key)
                    {
                        return true;
                    }
                }
            }
            return false;

        }

        // call Hash(key) and save return hash-value
        // if (no collision on hash-value) then place in table
        //else call rehash function until empty cell found or reached to threshold limit of rehashes
        // also count number of collisions on each key insertion
        public void insert(int key) { // keep maintain 1/3 empty cells

            int index = Hash(key);
            if (Table[index] == 0) {
                Table[index] = key;
                numofOccupiedCells++;
            }
            else
            {
                numofCollisions++;
                int i = 1;
                while (i < 11) {        //ASSUMING 10 IS THE THRESHOLD LIMIT OF REHASHES
                    int reIndex = Rehash(key, i);
                    if(reIndex>Table.length)
                    {
                        System.out.println("CANNOT BE INSERTED, ARRAY FULL");
                        return;
                    }
                    if (Table[reIndex] == 0) {
                        Table[reIndex] = key;
                        numofOccupiedCells++;
                        return;
                    } else {
                        i++;
                        numofCollisions++;
                    }
                }

            }
        }

        // search word in a hash table
        // call Hash(key) and save return hash-value
        // if (value match at hash-value index) return true
        //else call rehash function until empty cell found or it reaches threshold limit of rehashes.
        public boolean search(int key) {

            int index = Hash(key);
            if(Table[index]==key)
            {
                return true;
            }
            else
            {
                for(int i=1;i<11;i++) //THRESHOLD LIMIT IS 10 ASSUMING
                {
                    int reIndex = Rehash(key, i);
                    if(Table[reIndex]==key)
                    {
                        return true;
                    }
                }
            }
            return false;

        }

        public String toString() {
            String str = "";
            for (int i = 0; i < Table.length; i++) {
                str = str + "[" + i + "] " + Table[i] + "\n";
            }
            return str;
        }
        public String toStringQaud() {
            String str = "";
            for (int i = 0; i < TableQaud.length; i++) {
                str = str + "[" + i + "] " + TableQaud[i] + "\n";
            }
            return str;
        }


    }
