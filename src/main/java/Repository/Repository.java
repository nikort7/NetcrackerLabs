package Repository;

import Checker.PersonChecker;
import Compare.PersonComporator;
import Field.Person;

public interface Repository {
    public void insert(Person persone);

    public void delete(int index_of_del);

    public Person search(PersonChecker checker, Object value);

    public void sorteR(PersonComporator comporator);

    public Person[] getList();
}
