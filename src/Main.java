public class Main {
    public static void main(String[] args) {
        //Declaraation
        House bramptonHouse = new House();

        //Initialization
        bramptonHouse.year = 1996;
        bramptonHouse.color = "Black";
        bramptonHouse.address = "23 chopin ave, Scarborough";
        bramptonHouse.price = 200000000;

        bramptonHouse.CloseDoor();

        Dog tommy  = new Dog();
        Dog shampoo  = new Dog();


        tommy.name = "Tommy";
        tommy.color = "Black";
        tommy.Barks();
        tommy.Runs();
        System.out.println(tommy.getAge());

        shampoo.name = "Shampoo";
        shampoo.color = "White";
        shampoo.age = 15;
        shampoo.Barks();
        shampoo.Runs();
        System.out.println(shampoo.getAge());
    }
}
