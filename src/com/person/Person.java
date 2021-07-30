package com.person;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {
    public String firstName, lastName, address;
    public int age;
   // public Date birth;

    public Person(String firstName, String lastName, String address, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public void changeAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }
    /*
    public void setBirthDate(int day, int month, int year) throws ParseException {
        String birthDate = (day+" "+month+" "+year).toString();
        System.out.println(birthDate);
        DateFormat format = new SimpleDateFormat("MM DD,yyyy");
        Date date = format.parse(birthDate);

    }
    */

}
