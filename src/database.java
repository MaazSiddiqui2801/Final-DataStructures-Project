import java.io.*;
import java.util.Scanner;
import java.util.*;


public class database {

    public static void main(String[] args) {

        HashTable_Seprate_Chaining H = new HashTable_Seprate_Chaining();
        //Node_Hashtable[] array = new Node_Hashtable[135461];
        Scanner sc = null;
        //path: D:\Downloads\PopulationCensus-Project\Final-DataStructures-Project\src\populationData.xlsx
        try {
            //change  the path here to run the code
            // our data is named as populationData.xlsx
            String path = "D:\\Downloads\\PopulationCensus-Project\\Final-DataStructures-Project\\src\\data.csv";
            String line="";
            BufferedReader br = new BufferedReader(new FileReader(path));

            int counter = 0;

            while((line= br.readLine())!= null){

                String[] values = line.split(",");
               // array[counter]= new Node_Hashtable(values[0] ,  values[1] , values[2] , values[3] ,values[4] , values[5] , values[6]);
                H.insert(values[0] ,  values[1] , values[2] , values[3] ,values[4] , values[5] , Integer.parseInt(values[6]));
                counter++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }


    public String toString(){
        for(int i = 0; i<5 ; i++){
            System.out.println(H[i]);
        }
    }
}
