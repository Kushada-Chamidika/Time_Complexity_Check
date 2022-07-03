package dsa_asssignment_02;

/**
 *
 * @author 1999k
 */
public class ConstantFunction {

    int array[];

    public ConstantFunction(int[] array) {
        this.array = array;
    }

    public int getFirstElement() {
        if (array.length != 0) {
            return array[0];
        } else {
            return 0;
        }
    }

}
