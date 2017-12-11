package Repository;

import Checker.PersonChecker;
import Compare.PersonComporator;
import Field.Person;

abstract class MainRepository implements Repository{

    @Override
    public void insert(Person persone) {

//        Person[] temp_list = new Person[this.listOfPerson.length+1];
//        for (int i = 0; i < listOfPerson.length; i++)
//            temp_list[i] = listOfPerson[i];
//        temp_list[listOfPerson.length] = persone;
//        listOfPerson = temp_list;
    }

    @Override
    public void delete(int index_of_del) {

    }

    @Override
    public Person search(PersonChecker checker, Object value) {
        return null;
    }

    @Override
    public void sorteR(PersonComporator comporator) {

    }

    @Override
    public Person[] getList() {
        return new Person[0];
    }
}
