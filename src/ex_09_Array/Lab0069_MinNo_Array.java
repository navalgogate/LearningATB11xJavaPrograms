package ex_09_Array;

public class Lab0069_MinNo_Array {

    public static void main(String[] args) {

        int[] array = {25, 14, 19, 81, 44, 55, 87, 36};
        int min_output = min_elements(array);
        System.out.println(min_output);

    }


    private static int min_elements(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
            {
                min = array[i];
            }

        }
        return min;
    }
}
