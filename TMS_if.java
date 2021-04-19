public class TMS_if {
    public static void main(String[] args) {
        int month =12;

        if (month >11 && month < 3){
            System.out.println("Зима");
        } else if(month > 2 && month < 6){
            System.out.println("Весна");
        } else if(month > 5 && month < 9){
            System.out.println("Лето");
        } else {
            System.out.println("Осень");
        }

    }
}
