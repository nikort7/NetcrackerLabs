package Sort;

import Compare.PersonComporator;
import Field.Person;

public interface Sorter {

    public Person[] sort(Person[] list, PersonComporator comporator);

}
