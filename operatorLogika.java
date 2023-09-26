public class operatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // operator AND(&&)
        boolean resultAnd = a && b;
        System.out.println("a AND b = " + resultAnd);

        // operator OR(||)
        boolean resultOr = a || b;
        System.out.println("a OR b = " + resultOr);

        // operator not(! variable)
        boolean resultNot = !a;
        System.out.println("NOT a = " + resultNot);
    }
}
