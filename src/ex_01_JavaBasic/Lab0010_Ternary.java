package ex_01_JavaBasic;

public class Lab0010_Ternary {
    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 9;
        int n3 = 15;

        int max = (n1>n2) ? (n1>n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);

        System.out.println(max);
    }
}
