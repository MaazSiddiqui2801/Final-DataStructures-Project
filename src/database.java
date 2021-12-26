import java.io.*;
import java.util.Scanner;
import java.util.*;


public class database {

    public void databaseDesign() {

        Scanner sc = null;
        //path: D:\Downloads\PopulationCensus-Project\Final-DataStructures-Project\src\populationData.xlsx
        try {
            String path = "D:\\Downloads\\PopulationCensus-Project\\Final-DataStructures-Project\\src\\populationData.xlsx";
            BufferedReader br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (sc.hasNextLine())  //returns a boolean value
        {
            String x = sc.nextLine();//find and returns the next complete token from this scanner
            String[] Uni = x.split(",");
            String[] programs = Uni[1].split("-");

//			System.out.println(programs.length);
            //insert(Uni[0], Uni[3], Uni[2], programs,Uni[4]);
//			System.out.println("\nThe Name Of the Uni is = " + Uni[0] + " \nthe programs offered are = " + programs[0] + "," + programs[1] + "," +programs[2] +  "\nCity = " + Uni[2] + "\nCountry = " + Uni[3] );

//			System.out.println("\nThe Name Of the Uni is = " + Uni[0] + " \nthe programs offered are = " + Uni[1] +  "\nCity = " + Uni[2] + "\nCountry = " + Uni[3] );
        }
        sc.close();  //closes the scanner
        // Making 2-d  Array for Province List

        String[][] arr = new String[4][1];
        arr[0][0] = "Sindh";
        arr[1][0] = "Punjab";
        arr[2][0] = "Balochistan";
        arr[3][0] = "KP";//Khyber Pakhtunkhwa
        arr[4][0] = "FATA";// Federally Administrated Tribal Area


        //for(int i=0; i<=10000000)


    }

    public static void main(String[] args) {

       // System.out.println("~LINEAR PROBING~");
        HashTable H = new HashTable(100);
        //HashTable HQ = new HashTable(100);
        Random R = new Random();
        for (int i = 0; i < 100; i++) {
            int key = R.nextInt(900) + 100; // generate hundred 3-digit random number
            H.insert(key);
            H.insertQaud(key);
        }

        System.out.println(H);
        System.out.println();
        System.out.println("No of Collisions are: " + H.numofCollisions);
        System.out.println("No of Occupied Cells are: " + H.numofOccupiedCells);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE SEARCH VALUE: ");
        int value = input.nextInt();
        System.out.println("SEARCH VALUE FOUND: " + H.search(value));


//        for (int i = 0; i < 100; i++) {
//            int key = R.nextInt(900) + 100; // generate hundred 3-digit random number
//            HQ.insertQaud(key);
//        }
        System.out.println("~QUADRATIC PROBING~");
        System.out.println(H.toStringQaud());
        System.out.println();
        System.out.println("No of Collisions are: " + H.numofCollisionsQaud);
        System.out.println("No of Occupied Cells are: " + H.numofOccupiedCellsQaud);
        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.print("ENTER THE SEARCH VALUE: ");
        int value2 = input2.nextInt();
        System.out.println("SEARCH VALUE FOUND: " + H.searchQaud(value2));


        //H.find(R); // find number you already insert , also check the not found case
        //System.out.println(H);
    }


}
