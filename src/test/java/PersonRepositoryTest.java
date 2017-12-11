import Checker.IdPersonCheker;
import Checker.PersonChecker;
import Compare.CompareByID;
import Compare.PersonComporator;
import Field.Person;
import Field.PersonRepository;
import Sort.BubbleSort;
import Sort.Sorter;
import org.joda.time.LocalDate;
import org.junit.Test;


import static org.junit.Assert.*;

public class PersonRepositoryTest {

    @Test
    public void insert () throws Exception {

        Person pActual  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        PersonRepository listOfPersonActual = new PersonRepository();
        listOfPersonActual.insert(pActual);
        Person pA = new Person();
        pA = listOfPersonActual.getList()[0];

        Person pExpectrd  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);

        assertEquals (pExpectrd.getName(), pA.getName());
        assertEquals (pExpectrd.getDate(), pA.getDate());
        assertEquals (pExpectrd.getID(), pA.getID());
    }

    @Test
    public void delete() throws Exception {

        Person person1  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        Person person2  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        Person person3  = new Person(LocalDate.parse("1999-05-02"), "ccc", 3);
        PersonRepository listOfPersonActual = new PersonRepository();

        listOfPersonActual.insert(person1);
        listOfPersonActual.insert(person2);
        listOfPersonActual.insert(person3);

        listOfPersonActual.delete(2);

        PersonRepository listOfPersonExpectrd = new PersonRepository();
        listOfPersonExpectrd.insert(person1);
        listOfPersonExpectrd.insert(person3);

        assertEquals (listOfPersonExpectrd.getList(), listOfPersonActual.getList());

    }

    @Test
    public void search() throws Exception {
        Person person1  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        Person person2  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        PersonRepository listOfPerson = new PersonRepository();
        listOfPerson.insert(person1);
        listOfPerson.insert(person2);
        Person pActual = new Person();
        int value = 1;

        for (Person p : listOfPerson.getList()) {
            PersonChecker checker = new IdPersonCheker();
            if (checker.check(p, value)) {
                pActual = p;
            }
        }
        assertEquals(value, pActual.getID());
    }

    @Test
    public void searchByName() throws Exception {

        PersonRepository listOfPerson = new PersonRepository();
        String name = "qwe";
        Person person1  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        Person person2  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        listOfPerson.insert(person1);
        listOfPerson.insert(person2);

        assertEquals(name, listOfPerson.searchByName(name).getName());
    }

    @Test
    public void searchByID() {
        PersonRepository listOfPerson = new PersonRepository();
        String id = "1";
        Person person1  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        Person person2  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        listOfPerson.insert(person1);
        listOfPerson.insert(person2);

        assertEquals(Integer.parseInt(id), listOfPerson.searchByID(id).getID());
    }

    @Test
    public void searchByDate() {
        PersonRepository listOfPerson = new PersonRepository();
        LocalDate date = LocalDate.parse("2000-01-01");
        Person person1  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        Person person2  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        listOfPerson.insert(person1);
        listOfPerson.insert(person2);

        assertEquals(date, listOfPerson.searchByDate("2000-01-01").getDate());
    }

    @Test
    public void sorteR(){
        PersonComporator comporator = new CompareByID();
        Person[] person = new Person[2];
        person[0]  = new Person(LocalDate.parse("2000-01-01"), "qwe", 1);
        person[1]  = new Person(LocalDate.parse("2000-01-02"), "aaa", 2);
        PersonRepository listOfPersonA = new PersonRepository();
        listOfPersonA.insert(person[1]);
        listOfPersonA.insert(person[0]);

        Sorter sorter = new BubbleSort();

        assertEquals(person, sorter.sort(person, comporator));
    }

}