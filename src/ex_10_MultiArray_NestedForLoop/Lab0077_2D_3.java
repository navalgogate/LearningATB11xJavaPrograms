package ex_10_MultiArray_NestedForLoop;

public class Lab0077_2D_3 {

    public static void main(String[] args) {
        int [] [] Matrix = {{1,2,3}, {4,5,6}, {7,8,9}};


        for (int i=0; i< Matrix.length; i++)
        {
            for (int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix [i] [j]+ " | ");
            }
            System.out.println();
        }

    }
}
