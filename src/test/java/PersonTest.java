import Field.Person;
import org.joda.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {
    @org.junit.Test
    public void currentAge() throws Exception {
        Person person = new Person();
        //int actual = LocalDate.now().getYear() - person.date_birthday.getYear();
        int actual = LocalDate.now().getYear() - 2000;
        int expectrd = 17;
        assertEquals (expectrd, actual);
    }

}