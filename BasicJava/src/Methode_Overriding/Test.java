package Methode_Overriding;

public class Test {

    public static void main(String[] args) {

        //Teaceher information calling.
        Teacher t1 = new Teacher();

        t1.name = "Bashir";
        t1.age = 28;
        t1.Qualification = "MSC";

        t1.diplayInformation();

        //Person Information Calling.
        Person p1 = new Person();
        p1.name = "Hossain";
        p1.age = 30;
        p1.diplayInformation();

    }

}
