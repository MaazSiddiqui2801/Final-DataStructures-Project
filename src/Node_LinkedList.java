public class Node_LinkedList {
    String Province;
    String District;
    String UorR;
    String Sex;
    String SEC;
    String AgeGroup;
    int Population;
    Node_LinkedList next;
    
    public Node_LinkedList(String Province,String District,String UorR,String Sex, String SEC,String AgeGroup,int Population)
    {
        this.Province = Province;
        this.District = District;
        this.AgeGroup = AgeGroup;
        this.Sex= Sex;
        this.SEC = SEC;
        this.Population = Population;
        this.UorR = UorR;
    }

    public Node_LinkedList(String value, String value1, String value2, String value3, String value4, String value5, String value6) {
    }
}
