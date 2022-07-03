package dsa_asssignment_02;

/**
 *
 * @author 1999k
 */
public class QuadricFunction {

    public void getAllPossibleOrders(int arr1[], int arr2[]) {

        int array1[] = arr1;
        int array2[] = arr2;

        for (int i = 0; i < array1.length; i++) {
            int j = array1[i];
            for (int k = 0; k < array2.length; k++) {
                int l = array2[k];
                System.out.println("Possible Orders : " + j + " & " + l);
            }
        }

    }

}
