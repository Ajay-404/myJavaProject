import java.sql.SQLOutput;

public class OperatorOverloading {
    public static void main(String[] args) {
        new1 a = new new1();
        a.set();
    }
}

class new1
{
    int a =10;
    String b = "Ajay";
    int c=20, d=30;
    void set()
    {
        System.out.println(a+c+b+d); //30Ajay30
        System.out.println(b+a+c+d); //Ajay60
        System.out.println(a+c+d+b); //60Ajay
        System.out.println(c+d+a+b); //60Ajay
    }
}
