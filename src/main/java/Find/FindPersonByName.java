package Find;

import Field.Person;

public class FindPersonByName implements Find.FindPerson {

    public Person findPerson(Person[] list, String str) {
        for (int i = 0; i < list.length; i++) {
            if (str.compareTo(list[i].getName()) == 0)
                return list[i];
        }
        return null;
    }
}
