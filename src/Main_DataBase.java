import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main_DataBase {
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
                Province = new Node(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
                H.insert(Province);
            }
            Node[] Province_HashValues = H.search("Punjab");
            //Storing Province based data now according to District wise

            //Now input District
            //System.out.println("Enter District: ");
            //for (int i = 0; i < Province_HashValues.length; i++) {
            //  System.out.println(Province_HashValues[i].Province + " " + Province_HashValues[i].DISTRICT + " " + Province_HashValues[i].UrbanOrRural + " " + Province_HashValues[i].Gender + " " + Province_HashValues[i].SEC +" "+  Province_HashValues[i].Data);
            //}
            int x = 0;
            if (Province_HashValues[0].Province.equals("Punjab"))
                x = 38;
            else if (Province_HashValues[0].Province.equals("FATA"))
                x = 12;
            else if (Province_HashValues[0].Province.equals("Sindh"))
                x = 24;
            else if (Province_HashValues[0].Province.equals("KP"))
                x = 25;
            else if (Province_HashValues[0].Province.equals("Balochistan"))
                x = 31;
            HashTable2 H2 = new HashTable2(x);
            for (int i = 0; i < Province_HashValues.length; i++) {
                H2.insert(Province_HashValues[i]);
            }

            Node[] District_HashValues = H2.search("VEHARI DISTRICT", Province_HashValues[0].Province);
            for (int i = 0; i < District_HashValues.length; i++) {
                 System.out.println(District_HashValues[i].Province + " " + District_HashValues[i].DISTRICT + " " + District_HashValues[i].UrbanOrRural + " " + District_HashValues[i].Gender + " " + District_HashValues[i].SEC +" "+ District_HashValues[i].Age_Group+ " "+ District_HashValues[i].Data);
            }
            System.out.println("District Filter Done!");


            //Scanner sc = new Scanner(System.in);


            //System.out.println("urban or rural?");
            String UrbanRural = "Urban";//sc.next();
            Node[] UorR;
            int count = 0;
            for (int i = 0; i < District_HashValues.length; i++) {
                if (District_HashValues[i].UrbanOrRural.equals(UrbanRural))
                    count++;
            }
            UorR = new Node[count];
            double total = 0;


            if (UrbanRural.equals("Urban") || UrbanRural.equals("Rural")) {


                int count2 = 0;
                for (int i = 0; i < District_HashValues.length; i++) {
                    if (District_HashValues[i].UrbanOrRural.equals(UrbanRural)) {
                        UorR[count2] = District_HashValues[i];
                        count2++;
                    }
                }

                for (int i = 0; i < UorR.length; i++) {
                    System.out.println(UorR[i].Province + " " + UorR[i].DISTRICT + " " + UorR[i].UrbanOrRural + " " + UorR[i].Gender + " " + UorR[i].SEC +UorR[i].Age_Group+ " "+ " " + UorR[i].Data);
                    total = total + Integer.parseInt(UorR[i].Data);
                }
                System.out.println("Total is ************************************************" + total); //Total of Male or Female
            } else if (UrbanRural.equals("All")) {
                total = 0;
                for (int i = 0; i < District_HashValues.length; i++) {
                    total = total + Integer.parseInt(District_HashValues[i].Data);
                }
                System.out.println("Total is  /////////////////////////////////////////////// " + total); //Total of Both
            }


            /*System.out.println("which gender?");
            String gender = sc.next();
            System.out.println("which socio-economic class?");
            String sec = sc.next();
            System.out.println("which age group?");
            String ageGroup = sc.next();

             */
            //
            ////////////////////Gender

            String Sex = "Male";//sc.next();
            Node[] sex;
            int countSex = 0;
            for (int i = 0; i < UorR.length; i++) {
                if (UorR[i].Gender.equals(Sex)) {
                    countSex++;
                }

            }
            sex = new Node[countSex];
            double total2 = 0;
            if ((Sex.equals("Male") || Sex.equals("Female"))) {

                System.out.println("Checking Gender Now");  ///

                int countSex2 = 0;
                for (int i = 0; i < UorR.length; i++) {
                    if (UorR[i].Gender.equals(Sex)) {   /////
                        sex[countSex2] = District_HashValues[i];
                        countSex2++;
                    }
                }

                for (int i = 0; i < sex.length; i++) {
                    System.out.println(sex[i].Province + " " + sex[i].DISTRICT + " " + sex[i].UrbanOrRural + " " + sex[i].Gender + " " + sex[i].SEC + sex[i].Age_Group+ " "+" " + sex[i].Data);
                    total2 = total2 + Integer.parseInt(District_HashValues[i].Data);
                }
                System.out.println("Total is " + total2);
            } else if (UrbanRural.equals("All")) {

                for (int i = 0; i < UorR.length; i++) {
                    total2 = total2 + Integer.parseInt(District_HashValues[i].Data);
                }
                System.out.println("Total is " + total2);
            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////
            ////////////////////////////////////////

            //// CHECK FOR Socio-Economic Class
            // Sec A-E

            String Sec = "SEC B";//sc.next();
            Node[] Class;
            int countSec = 0;
            for (int i = 0; i < sex.length; i++) {
                if (sex[i].SEC.equals(Sec)) {
                    countSec++;
                }

            }
            Class = new Node[countSec];
            double total3 = 0;

            if (Sec.equals("SEC A") || Sec.equals("SEC B") || Sec.equals("SEC C") || Sec.equals("SEC D") || Sec.equals("SEC E")) {

                System.out.println("Checking Soico Economic CLass Now ");  ///

                int countSec2 = 0;
                for (int i = 0; i < sex.length; i++) {
                    if (sex[i].SEC.equalsIgnoreCase(Sec)) {   /////
                        Class[countSec2] = sex[i];
                        countSec2++;
                    }

                }
                for (int i = 0; i < Class.length; i++) {
                    System.out.println(Class[i].Province + " " + Class[i].DISTRICT + " " + Class[i].UrbanOrRural + " " + Class[i].Gender + " " + Class[i].SEC + Class[i].Age_Group+ " "+ " " + Class[i].Data);
                    if(Class[i]!=null){

                    total3 = total3 + Integer.parseInt(Class[i].Data);}
                }
                System.out.println("Total is------------------------------------------------------------ " + total3);///////
            } else if (Sec.equals("All")) {

                for (int i = 0; i < Class.length; i++) {
                    total3 = total3 + Integer.parseInt(Class[i].Data);
                }
                System.out.println("Total is ---------------------------------------------------------" + total3);
            }


            String age = "10-14";//sc.next();/////
           //age.trim();
            Node[] AGE;
            int countAge = 0;
            for (int i = 0; i < Class.length; i++) {
                if (Class[i].Age_Group.equals(age)) {
                    countAge++;
                }

            }
            AGE = new Node[countAge];
            double total4 = 0;

            if (age.equals("05-09") || age.equals("10-14") || age.equals("15-19") || age.equals("20-24") || age.equals("25-29")|| age.equals("30-34")|| age.equals("35-39")|| age.equals("40-44")|| age.equals("45-49")|| age.equals("50-54")|| age.equals("55-59")|| age.equals("60+")|| age.equals("Upto 4 yrs.")) {

                System.out.println("Checking Age Group Now //////////////////////////////////////////////////////////////////////////");  ///
                int countAge2 = 0;
                for (int i = 0; i < Class.length; i++) {
                    if (Class[i].Age_Group.equals(age)) {
                        /////
                        AGE[countAge2] = Class[i];
                        countAge2++;

                    }

                }
                for (int i = 0; i < AGE.length; i++) {
                    System.out.println(AGE[i].Province + " " + AGE[i].DISTRICT + " " + AGE[i].UrbanOrRural + " " + AGE[i].Gender + " " + AGE[i].SEC + AGE[i].Age_Group+ " "+ " " + AGE[i].Data);

                       total4 = total4 + Integer.parseInt(AGE[i].Data);

                }
                System.out.println("Total is------------------------------------------------------------ " + total4);///////
                System.out.println(AGE.length);
            } else if (age.equalsIgnoreCase("All")) {

                for (int i = 0; i < Class.length; i++) {
                    total4 = total4 + Integer.parseInt(Class[i].Data);
                }
                System.out.println("Total is ---------------------------------------------------------" + total4);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
