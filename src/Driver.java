import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        System.out.println("hello! welcome to Pak Pop, a search engine for xyz where you can do xyz");
        System.out.println();
        System.out.println("which province?");
        Scanner sc = new Scanner(System.in);
        String province = sc.next();
        System.out.println("which district?");
        String district = sc.next();
        System.out.println("urban or rural?");
        String urbanRural = sc.next();
        System.out.println("which gender?");
        String gender = sc.next();
        System.out.println("which socio-economic class?");
        String sec = sc.next();
        System.out.println("which age group?");
        String ageGroup = sc.next();
        
        Home h = new Home();
        h.show();


        
    }
}
