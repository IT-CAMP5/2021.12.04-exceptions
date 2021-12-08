package pl.camp.it.exceptions;

public class Main2 {
    public static void main(String[] args) {
        try {
            a();
            //??
            //??
            //??
        } catch (ArithmeticException e) {
            System.out.println("Inny błąd !!");
        } catch (Exception e) {
            System.out.println("Błąd !!");
        } finally {
            System.out.println("zawsze !!");
        }

        //???
    }

    public static void a() {
        //????
    }
}
