package kata;

/**
 *
 * @author Entrar
 */
import java.util.Date;

public class Kata {

    public static void main(String[] args) {
        Person person = new Person("Louka", new Date(102,5,1));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
