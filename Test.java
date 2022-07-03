package dsa_asssignment_02;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

        int array[] = new int[]{1, 2, 3, 4, 5, 6};

        // Constant Time Complexity Implementation.       
        ConstantFunction cf = new ConstantFunction(array);
        System.out.println("");
        System.out.println("Constant Functon Example -> ");
        System.out.println("Get First Element Of An Array : " + cf.getFirstElement());
        System.out.println("");

        // Logarithm Time Complexity Implementation.
        LogrithmFunction lgf = new LogrithmFunction();
        System.out.println("");
        System.out.println("Logarithm Functon Example -> ");
        lgf.logarithmFunction(16);
        System.out.println("");

        // Linear Time Complexity Implementation.
        LinearFunction lf = new LinearFunction(array);
        System.out.println("");
        System.out.println("Linear Function Example -> ");
        lf.executeArray();
        System.out.println("");

        // Quadric Time Complexity Implementation.
        QuadricFunction qf = new QuadricFunction();
        System.out.println("");
        System.out.println("Quadric Function Example -> ");
        int array1[] = new int[]{1, 2, 3, 4, 5};
        int array2[] = new int[]{6, 7, 8, 9, 10};
        qf.getAllPossibleOrders(array1, array2);
        System.out.println("");

    }

}
