public class House {

    //Variables
    String color;
    String address;
    double price;
    int year;

    //Methods
    void OpenDoor()
    {
        System.out.println("Doors open for house at: " + address);
    }
    void CloseDoor()
    {
        System.out.println("Doors closed for house at: " + address);
    }
    void TurnOnAC()
    {
        System.out.println("AC on for house at: " + address);
    }
}
