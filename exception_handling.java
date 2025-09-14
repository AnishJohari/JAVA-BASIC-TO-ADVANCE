public class exception_handling {
    public static void main(String[] args) {
        try {
            short i=1;
            short j=0;
            System.out.println(i/j);
        } catch (Exception e) {
            System.out.println("ERROR");

        }
    }
}