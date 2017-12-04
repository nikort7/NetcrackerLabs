package Find;

import Field.Person;
import org.joda.time.LocalDate;

public class FindPersonByDate implements Find.FindPerson {

    public Person findPerson(Person[] list, String str) {
        for (int i = 0; i < list.length; i++) {
            if (LocalDate.parse(str).compareTo(list[i].getDate()) == 0)
                return list[i];
        }
        return null;
    }
}
