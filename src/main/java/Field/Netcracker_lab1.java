package Field;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


import Compare.CompareByDate;
import Compare.CompareByID;
import Compare.CompareByName;
import org.joda.time.LocalDate;
import org.apache.log4j.Logger;


/**
 *
 * @author Никита
 */
public class Netcracker_lab1 {

    /**
     * @param args the command line arguments
     */
    private static final Logger LOGGER = Logger.getLogger(Netcracker_lab1.class);


    static int i = 0;
    public static void main(String[] args)  {

        LOGGER.debug("Programm is started");
        Person person2  = new Person();
        Person person3  = new Person();
        PersonRepository list_of_person = new PersonRepository();
        int choose;
        do
        {
            Person person1  = new Person();
            System.out.print("\nВыбирете действие:\n"
                    + "1. Добавение.\n"
                    + "2. Поиск. \n"
                    + "3. Удаление.\n"
                    + "4. Вывод.\n"
                    + "5. Сортировка.\n"
                    + "6. Выход\n");

            Scanner in = new Scanner (System.in);
            int index;
            choose = in.nextInt();

            switch (choose){
                case 1:
                    String
                            date,
                            month,
                            year,
                            name;

                    person1.setDate(LocalDate.parse("2000-01-01"));
                    person1.setID(1);
                    person1.setName("qwe");

                    person2.setDate(LocalDate.parse("2000-01-02"));
                    person2.setID(2);
                    person2.setName("aaa");

                    list_of_person.insert(person1);
                    list_of_person.insert(person2);

                    person3.setDate(LocalDate.parse("1999-05-02"));
                    person3.setID(3);
                    person3.setName("ccc");
                    list_of_person.insert(person3);
                    break;
                case 2:
                    System.out.print("\nВыбирете параметр поиска:\n"
                           + "1. ID.\n"
                           + "2. Имя. \n"
                           + "3. Дата.\n"
                           + "4. Отмена\n");
                    int choose_find = in.nextInt();
                    Scanner dt = new Scanner (System.in);
                    String str = "";
                    Person psearch = new Person();
                    switch (choose_find){
                       case (1):
                           str = "";
                           System.out.print("Введите индекс необходимого человека \n");
                           str = dt.nextLine();
                           psearch = list_of_person.searchByID(str);
                           if (psearch != null)
                               System.out.print("Найденный человек: "+ psearch.getName() +".\n");
                           else
                               System.out.print("Человек с таким ID не найден.");
                           break;

                       case (2):
                           str = "";
                           System.out.print("Введите имя необходимого человека \n");
                           str = dt.nextLine();
                           psearch = list_of_person.searchByName(str);
                           if (psearch != null)
                               //System.out.print("Найденный человек: "+ list_of_person.findPerson(new FindPersonByName(), str).getName() +".\n");
                               System.out.print("Найденный человек: "+ psearch.getName() +".\n");

                           else
                               System.out.print("Человек с таким именем не найден.");

                           break;
                       case (3):
                           str = "";
                           System.out.print("Введите дату необходимого человека \n");
                           str = dt.nextLine();
                           psearch = list_of_person.searchByDate(str);
                           if (psearch != null)
                               System.out.print("Найденный человек: "+ psearch.getName() +".\n");
                           else
                               System.out.print("Человек с такой датой не найден.");

                           break;
                       case (4):
                           break;
                       default:
                           System.out.print("Введена неверная команда.");
                           break;

                    }
                    break;

                case (3):
                    System.out.print("Введите индекс человека, который надо удалить.\n");
                    index = in.nextInt();
                    list_of_person.delete(index);
                    break;

                case (4):
                    list_of_person.show();
                    Scanner show = new Scanner (System.in);
                    System.out.println("Введите любое число, чтобы продолжить:\t");
                    int w = show.nextInt();
                    break;

                case (5):
                    int choose_param;
                    System.out.print("\nВыбирете сортровку:\n"
                                   + "1. По ID.\n"
                                   + "2. По имени. \n"
                                   + "3. По дате.\n"
                                   + "4. Отмена\n");
                    choose_param = in.nextInt();
                    switch (choose_param){
                       case (1):
                           //list_of_person.sort(new BubbleSort(), new CompareByID());
                           list_of_person.sorteR(new CompareByID());
                           break;
                       case (2):
                           list_of_person.sorteR(new CompareByName());
                           break;
                       case (3):
                           list_of_person.sorteR(new CompareByDate());
                           break;
                       case (4):
                           break;
                       default:
                           System.out.print("Введена неверная команда.");
                           break;
                    }
                    break;
                case (6):
                    break;
                default:
                    System.out.print("Введена неверная команда.");
                    break;
            }
        }while (choose != 6);

        LOGGER.info("Programm is finished");
    }

    
    
    
}
