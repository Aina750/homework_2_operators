import javax.xml.transform.SourceLocator;

public class TMS_even {
    public static void main(String[] args) {
        int n = 750;
        if((n%2)==0){
            System.out.println("Число " + n + " четное ");
        }
        else{
            if((n%1)==0){
                System.out.println("Число " + n + " нечетное ");
            }
        }
    }
}
