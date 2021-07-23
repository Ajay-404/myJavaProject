public class Dog {

    //Variables
    String color;
    String name;
    int age = 5;

    //Methods
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
