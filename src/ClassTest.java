public class ClassTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] { "C0318G", "A8746G"};
    public static final String[] invalidClass = new String[] { " M0318G", "P0323A"};
    public static void main(String[] args) {
        classExample = new ClassExample();

        for (String c: validClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Class is " + c +" is valid: "+ isvalid);
        }

        for (String c:invalidClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Class is " + c +" is valid: "+ isvalid);
        }
    }
}
