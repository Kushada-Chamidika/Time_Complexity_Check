package dsa_asssignment_02;

/**
 *
 * @author 1999k
 */
public class LinearFunction {

    int array[];

    public LinearFunction(int[] array) {
        this.array = array;
    }

    public void executeArray() {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                System.out.println("Printing array element " + i + " : " + value);
            }
        } else {
            System.out.println("Sorry Array Is Empty.");
        }
    }

}
