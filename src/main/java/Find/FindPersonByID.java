package Find;

import Field.Person;

public class FindPersonByID implements Find.FindPerson {

    public Person findPerson(Person[] list, String str) {
        for (int i = 0; i < list.length; i++) {
            if (Integer.parseInt(str) == list[i].getID())
                return list[i];
        }
        return null;
    }
}
