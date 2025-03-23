package ex_04_For_Loop;

public class Lab0038_For_Loop11_Cont_EvenNo {

    public static void main(String[] args) {

        for (int i=0; i<=50 ; i++)

        {
            if (i%2!=0)
            {
                continue;
            }
            System.out.println("Even: " +i);
        }

    }
}
