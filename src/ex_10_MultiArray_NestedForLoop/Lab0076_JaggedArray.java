package ex_10_MultiArray_NestedForLoop;

public class Lab0076_JaggedArray {
    public static void main(String[] args) {

        int [] [] array = {
                {10,20},
                {30,40,50},
                {111}};
// Jagged array means rows is not equal to column value

        for (int i=0; i< array.length; i++)
        {
            for (int j=0; j<array[i].length; j++){
                System.out.print(array [i] [j]+" | ");
            }
            System.out.println();
        }



    }
}
