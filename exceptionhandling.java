public class INPUT {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[10]=30/0;           
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurs");
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
         catch (NullPointerException e) {
            System.out.println("NullPointerException occurs");
        }

        System.out.println("reset the code");
    }
}