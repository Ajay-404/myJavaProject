public class Dog {

    //Variables

    String color;
    String name;
    int age = 10;
   // private int age = 10; this an not be modified/accessed from main
    static int count = 6;
    //final String name = "tiger"; Cannot assign value to this variable in main

    //Methods
    /*
    //A private method can not be accessed in Main class
    private void Barks(){System.out.println(name+" the "+color+" dog is barking");}
    */

    void Barks()
    {
        System.out.println(name+" the "+color+" dog is barking");
    }

    void Runs()
    {
        System.out.println(name+" the "+color+" dog is running at the age of "+age);
    }

    int getAge()
    {
        return age;
    }
}
