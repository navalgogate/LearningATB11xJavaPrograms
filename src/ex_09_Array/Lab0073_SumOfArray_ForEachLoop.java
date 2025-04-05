package ex_09_Array;

public class Lab0073_SumOfArray_ForEachLoop {


    public static void main(String[] args) {

        int [] number = {10,20,30};
        int sum = 0;

//        for (int i =0; i< number.length;i++)
//        {
//
//             sum = sum + number[i];
//
//        }
//
//        System.out.println(sum);


        System.out.println("For each ____"); // enhanced for loop
        for (int n : number)
            sum = sum + n;
        System.out.println(sum);


    }
}
