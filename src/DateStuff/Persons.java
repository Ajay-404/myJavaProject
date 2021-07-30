package DateStuff;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persons{
    public Date birthday;

    public void setBirthDate(int d, int m, int y){

        //Convert 3 int values into one string
        String sDate1 = (d+"/"+m+"/"+y).toString();

        //Specify the format
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");

        //Formatting the DateString sDate1
        try
        {
            birthday=formatter1.parse(sDate1);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println(birthday);

        Date todayDate = java.util.Calendar.getInstance().getTime();
        System.out.println(todayDate);

    }

}
