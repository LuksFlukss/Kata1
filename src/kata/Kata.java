package kata;

import java.time.LocalDate;

public class Kata {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 5, 1);
        
        Person person = new Person("Louka", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
