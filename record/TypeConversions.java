public class TypeConversions{
    public static void main(String[] args) {
        //implicit type conversion
        int numInt = 100;
        float numFloat = numInt; // int to float
        double numDouble = numFloat; // float to double

        System.out.println("Implicit Type Conversion:");
        System.out.println("int to float: " + numFloat);
        System.out.println("float to double: " + numDouble);

        //explicit type conversion
        double numDouble2 = 123.456;
        float numFloat2 = (float) numDouble2; // double to float
        int numInt2 = (int) numLong2; // long to int

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("double to float: " + numFloat2);
        System.out.println("long to int: " + numInt2);
    }
}
