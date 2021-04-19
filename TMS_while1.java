public class TMS_while1 {
    public static void main(String[] args) {
        int i = -50;
        boolean b = false;
        while (i < 0){
            if(b){
                i--;

            }else {
                i = i +5;
            }

            System.out.println("step = " + i);


        }
    }
}
