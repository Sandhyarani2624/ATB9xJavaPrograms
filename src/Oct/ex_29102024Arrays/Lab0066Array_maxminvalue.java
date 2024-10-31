package Oct.ex_29102024Arrays;

public class Lab0066Array_maxminvalue {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 2, 5, 6, 2, 7};
        int max_value = give_max(array);
        int min_value = give_min(array);
        System.out.printf("Max value is %d", max_value);
        System.out.println();
        System.out.printf("Min value is %d", min_value);

    }

    static int give_max(int[] array) {   //function, with return type and parameters
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    static int give_min(int[] array) {   //function, with return type and parameters
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

}
