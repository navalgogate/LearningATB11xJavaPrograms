package ex_10_MultiArray_NestedForLoop;

public class Lab0075_2DArray {

    public static void main(String[] args) {

       //int [] [] Array_2D_anotherway = {{1,2,3}, {4,5,6}, {7,8,9}};
        // int [] [] Array_2D_anotherway = {{1}, {6}, {9}};
        int [] [] Array_2D = new int [3] [3];
        Array_2D [0] [0] = 1;
        Array_2D [0] [1] = 2;
        Array_2D [0] [2] = 3;

        Array_2D [1] [0] = 4;
        Array_2D [1] [1] = 5;
        Array_2D [1] [2] = 6;

        Array_2D [2] [0] = 7;
        Array_2D [2] [1] = 8;
        Array_2D [2] [2] = 9;
        System.out.println(Array_2D [2] [1]);
//
//       for (int i=0; i< Array_2D.length; i++)
//       {
//           for (int j=0; j<Array_2D[i].length; j++)
//           System.out.println(Array_2D[i] [j]);
//       }

    }
}
