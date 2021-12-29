import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read_CSV_File {
    public static void main(String[] args) {
        String path = "D:\\Downloads\\PopulationCensus-Project\\Final-DataStructures-Project\\src\\data.csv";
        String line = "";
        Node Province;
        try {

            BufferedReader br = new BufferedReader(new FileReader(path));
            int counter = 0;
            HashTable H = new HashTable(5); //5 Provinces
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Province = new Node(values[0]  , values[1] , values[2] , values[3] , values[4] , values[5] , values[6]);
                H.insert(Province);
            }
            Node[] Province_HashValues =  H.search("Punjab");
            //Storing Province based data now according to District wise

            //Now input District
            //System.out.println("Enter District: ");
            //for (int i = 0; i < Province_HashValues.length; i++) {
              //  System.out.println(Province_HashValues[i].Province + " " + Province_HashValues[i].DISTRICT + " " + Province_HashValues[i].UrbanOrRural + " " + Province_HashValues[i].Gender + " " + Province_HashValues[i].SEC +" "+  Province_HashValues[i].Data);
            //}
            int x = 0;
            if(Province_HashValues[0].Province.equals("Punjab"))
                x = 38;
            else if(Province_HashValues[0].Province.equals("FATA"))
                x = 12;
            else if (Province_HashValues[0].Province.equals("Sindh"))
                x = 24;
            else if(Province_HashValues[0].Province.equals("KP"))
                x = 25;
            else if(Province_HashValues[0].Province.equals("Balochistan"))
                x = 31;
                HashTable2 H2 = new HashTable2(x);
            for (int i = 0; i < Province_HashValues.length; i++) {
                H2.insert(Province_HashValues[i]);
            }

            Node[] District_HashValues =  H2.search("VEHARI DISTRICT",Province_HashValues[0].Province);
            for (int i = 0; i < District_HashValues.length; i++) {
                System.out.println(District_HashValues[i].Province + " " + District_HashValues[i].DISTRICT + " " + District_HashValues[i].UrbanOrRural + " " + District_HashValues[i].Gender + " " + District_HashValues[i].SEC +" "+  District_HashValues[i].Data);
            }



            //Scanner sc = new Scanner(System.in);


            //System.out.println("urban or rural?");
            String UrbanRural = "All";//sc.next();
            Node[] UorR;
            int count = 0;
            for (int i = 0; i < District_HashValues.length; i++) {
                if (District_HashValues[i].UrbanOrRural.equals(UrbanRural))
                    count++;
            }
            UorR = new Node[count];

            if(UrbanRural.equals("Urban") || UrbanRural.equals("Rural")) {


                int count2 = 0;
                for (int i = 0; i < District_HashValues.length; i++) {
                    if (District_HashValues[i].UrbanOrRural.equals(UrbanRural)) {
                        UorR[count2] = District_HashValues[i];
                        count2++;
                    }
                }

                for (int i = 0; i < UorR.length; i++) {
                    System.out.println(UorR[i].Province + " " + UorR[i].DISTRICT + " " + UorR[i].UrbanOrRural + " " + UorR[i].Gender + " " + UorR[i].SEC + " " + UorR[i].Data);
                }
            }
            else if(UrbanRural.equals("All")){
                double total = 0;
                for (int i = 0; i < District_HashValues.length; i++) {
                    total = total + Integer.parseInt(District_HashValues[i].Data);
                }
                System.out.println("Total is " + total);
            }


            /*System.out.println("which gender?");
            String gender = sc.next();
            System.out.println("which socio-economic class?");
            String sec = sc.next();
            System.out.println("which age group?");
            String ageGroup = sc.next();

             */
            //Rural/Urban





        }


    catch(FileNotFoundException e ){
            e.printStackTrace();
        }
    catch(IOException e){
            e.printStackTrace();
        }


            //for(int i = 0; i < 100; i++){
              //  H.insert(Initial_Table[i],i);
            //}
            // Take User Input of Province
            //System.out.println("Enter Province to Search: ");
            //Node[] Province = H.search("Balochistan");



    }

}
