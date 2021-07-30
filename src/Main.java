import com.pragra.Math;
import com.training.*;
import com.person.Person;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Declaraation
        /*
        House bramptonHouse = new House();

        //Initialization
        bramptonHouse.year = 1996;
        bramptonHouse.color = "Black";
        bramptonHouse.address = "23 chopin ave, Scarborough";
        bramptonHouse.price = 200000000;

        bramptonHouse.CloseDoor();*/

        //Dog class examples
        /*
        Dog tommy  = new Dog();
        Dog shampoo  = new Dog();


        tommy.name = "Tommy";
        tommy.color = "Black";
        tommy.age = 5;
        tommy.Barks();
        tommy.Runs();
        //System.out.println(tommy.getAge());

        shampoo.name = "shampoo";
        shampoo.color = "white";
        shampoo.age = 10;
        shampoo.Barks();
        shampoo.Runs();
       //System.out.println(shampoo.getAge());
    */

        //Checking is 2 objects have same reference if they have same values
        /*
        if(tommy == shampoo)
        {
            System.out.println(tommy);
            System.out.println(shampoo);
            System.out.println("reference is same");
        }
        else
        {
            System.out.println(tommy);
            System.out.println(shampoo);
            System.out.println("reference is different");
        }
        if(tommy.equals(shampoo))
        {
            System.out.println("Value is same");
        }
        else
        {
            System.out.println("Value is not same");
        }
        */

        //teacher student example in com.pragra package
        /*
        com.pragra.Student myStudent = new com.pragra.Student();
        com.pragra.Teacher myTeacher = new com.pragra.Teacher();

        myStudent.age = 5;
        myStudent.printAge();

        myTeacher.subject = "Programming";
        myTeacher.showSubject();
        */
        /*
        com.pragra.Math pragraMath = new com.pragra.Math();
        pragraMath.getPragraClass();
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth day: ");
        int day = scanner.nextInt();
        System.out.println("Please enter your birth month: ");
        int month = scanner.nextInt();
        System.out.println("Please enter your birth year: ");
        int year = scanner.nextInt();
        */

        Person individual = new Person("Ajay", "Sharma", "23 Chopin ave", 25);

        String newAdd = "20 rossander crt";

        System.out.println("Full Name: " + individual.getFullName());
        System.out.println("Address: " + individual.getAddress());
        individual.changeAddress(newAdd);
        System.out.println("New Address: " + individual.getAddress());
        System.out.println("The age is: " + individual.getAge());
        //individual.setBirthDate(day, month, year);




    }
}