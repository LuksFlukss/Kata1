package kata;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set (2002, 5, 1);
        
        Person person = new Person("Louka", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
