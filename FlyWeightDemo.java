public class FlyWeightDemo {
    public static void main(String[] args) {
        int primitive = 42;
        Integer intA = Integer.valueOf(primitive);
        Integer intB = Integer.valueOf(primitive);
        Integer intC = new Integer(42);
        
        System.out.println("True or False? " + (intA == intB));
        System.out.println("True or False? " + (intA == intC));
        
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        
        System.out.println("True or False? " + (s1 == s2));
        System.out.println("True or False? " + (s1 == s3));
    }
}
