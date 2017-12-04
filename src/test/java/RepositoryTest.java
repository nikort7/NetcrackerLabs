import Field.Person;
import Field.Repository;
import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepositoryTest {
    @Test
    public void delete() throws Exception {

        Person person1  = new Person();
        Person person2  = new Person();
        Person person3  = new Person();
        Repository listOfPersonActual = new Repository();

        person1.setDate(LocalDate.parse("2000-01-01"));
        person1.setID(1);
        person1.setName("qwe");

        person2.setDate(LocalDate.parse("2000-01-02"));
        person2.setID(2);
        person2.setName("aaa");

        person3.setDate(LocalDate.parse("1999-05-02"));
        person3.setID(3);
        person3.setName("ccc");

        listOfPersonActual.insert(person1);
        listOfPersonActual.insert(person2);
        listOfPersonActual.insert(person3);

        listOfPersonActual.delete(2);

        Repository listOfPersonExpectrd = new Repository();
        listOfPersonExpectrd.insert(person1);
        listOfPersonExpectrd.insert(person3);

        assertEquals (listOfPersonExpectrd.getList(), listOfPersonActual.getList());

    }



}