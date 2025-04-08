package ex_11_OOPs;

public class Lab0083_Cats {

    public static void main(String[] args) {

        cat c1 = new cat(); //one object"new cat()"
        cat c2; //no object

        new cat();

        c1.running();

        new cat().running();
        System.out.println(new cat().name);

        //total four object in this programe  "new cat()"
    }


}


class cat
{
    String name;
    void running()
    {
        System.out.println("Running");
    }

}