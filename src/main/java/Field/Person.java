package Field;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.joda.time.LocalDate;

/**
 *
 * @author Никита
 */
public class Person {
    private LocalDate dateBirthday;
    private String lastName;
    private int id;

    public Person(){
    }
    public Person(LocalDate dateBirthday, String lastName, int id){
        this.dateBirthday = dateBirthday;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Setting ID of Person
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     * Setting name of Person
     */
    public void setName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Setting date of Person
     */
    public void setDate(LocalDate dateBirthday){
        this.dateBirthday = dateBirthday;
    }

    /**
     * Getting ID of Person
     */
    public int getID(){
        return id;
    }

    /**
     * Getting name of Person
     */
    public String getName(){
        return lastName;
    }

    /**
     * Getting date of Person
     */
    public LocalDate getDate(){
        return dateBirthday;
    }

    int CurrentAge(LocalDate dateBirthday){
        return LocalDate.now().getYear() - dateBirthday.getYear();
    }
    
}
