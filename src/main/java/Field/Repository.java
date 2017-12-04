package Field;

import Checker.NamePersonChecker;
import Checker.IdPersonCheker;
import Checker.DatePersonChecker;
import Checker.PersonChecker;
import Compare.PersonComporator;
import Find.FindPerson;
import Field.Person;
import Sort.Sorter;

/**
 *
 * @author Никита
 */
public class Repository {
    private Person[] listOfPerson;
    private int size;
    private Sorter sorter;
    

    public Repository() {
        this.listOfPerson = new Person[0];
        this.size = size;
        this.sorter = Config.getSorter();
    }

    public Person[] getList(){
        return listOfPerson;
    }


    /**
     * Добавление в массив
     * @param persone
     */
    public void insert (Person persone){
        
            Person[] temp_list = new Person[this.listOfPerson.length+1];
            for (int i = 0; i < listOfPerson.length; i++)
                temp_list[i] = listOfPerson[i];
            temp_list[listOfPerson.length] = persone;
            listOfPerson = temp_list;
   
    }


    /**
     * Удаление из массива
     * @param index_of_del
     */
    public void delete (int index_of_del){

        Person[] temp_list_for_delete = new Person[this.listOfPerson.length - 1];
        
        for (int i = 0; i < index_of_del-1; i++)
            temp_list_for_delete[i] = listOfPerson[i];
        
        for (int i = index_of_del-1; i < temp_list_for_delete.length; i++)
            temp_list_for_delete[i] = listOfPerson[i+1];
        
        listOfPerson = temp_list_for_delete;
        
    }


    /**
     * Поиск по массиву
     * @param find
     * @param str
     * @return
     */
    public Person findPerson (FindPerson find, String str){

        Person p = find.findPerson(listOfPerson, str);
        if (p != null)
            return find.findPerson(listOfPerson, str);
        else
            return null;
    }

    public Person search(PersonChecker checker, Object value) {
        for (Person p : listOfPerson) {
            if (checker.check(p, value)) {
                return p;
            }
        }
        return null;
    }

    public Person searchByName(String name) {
        return search(new NamePersonChecker(), name);
    }
    public Person searchByID(String id) {
        return search(new IdPersonCheker(), id);
    }
    public Person searchByDate(String date) {
        return search(new DatePersonChecker(), date);
    }

    /**
     * Вывод
     */
    public void show(){
        for (int i = 0; i < listOfPerson.length; i++)
            System.out.println("ID\t" + listOfPerson[i].getID()
                             + "\nИмя\t" + listOfPerson[i].getName()
                             + "\nДата Рождения\t" + listOfPerson[i].getDate()
                             + "\nВозраст\t" + listOfPerson[i].CurrentAge(listOfPerson[i].getDate()));
    }

    /**
     * Сортровка массива
     * @param sorter
     * @param comporator
     */
    public void sort(Sorter sorter, PersonComporator comporator){
        listOfPerson = sorter.sort(listOfPerson, comporator);
    }

    public void sorteR(PersonComporator comporator){
        listOfPerson = sorter.sort(listOfPerson, comporator);
    }
    /*
       public class PersonRepository {

    private Person[] personList;
    private int size;

    private IPersonListSorter sorter = Configurator.getInstance().getSorter();
}


    public void sortByParams(IPersonListSorter sorter, IPersonComparator comparator) {
        this.personList = sorter.sort(this.personList, comparator);
    }

*/
//     private Repository search(PersonChecker checker, Object value) {
//         Repository result = new Repository();
//         for (Person p : listOfPerson) {
//             if (checker.check(p, value)) {
//                 result.insert(p);
//             }
//         }
//         return result;
//     }


/*
    public PersonRepository searchByFio(String fio) {
        return search(new FioPersonChecker(), fio);
    }

//    public PersonRepository searchByAge(Integer age) {
//        return search((p,a)->p.getAge().equals(a), age);
//    }
//
//    public PersonRepository searchByDOB(LocalDate date) {
//        return search((p,a)->p.getDateOfBirth().equals(a), age);
//    }
}

/*
в папке ресурсов создать properties
Configurator.getInstance().getSorter();
настроить maven чтобы при сборке ресурсов все файлы попадали в сборку (resources)
        */
}
