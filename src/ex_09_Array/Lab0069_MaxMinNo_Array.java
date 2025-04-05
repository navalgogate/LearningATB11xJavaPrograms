package ex_09_Array;

public class Lab0069_MaxMinNo_Array {

    public static void main(String[] args) {

        int[] array = {25, 14, 19, 81, 44, 55, 87, 36};
        int max_output = max_elements(array);
        System.out.println(max_output);

    }


    private static int max_elements(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
            {
                max = array[i];
            }

        }
        return max;
    }
}
