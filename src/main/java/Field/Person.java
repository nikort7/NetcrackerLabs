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
     * @param id
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     * Setting name of Person
     * @param lastName
     */
    public void setName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Setting date of Person
     * @param dateBirthday
     */
    public void setDate(LocalDate dateBirthday){
        this.dateBirthday = dateBirthday;
    }

    /**
     * Getting ID of Person
     * @return
     */
    public int getID(){
        return id;
    }

    /**
     * Getting name of Person
     * @return
     */
    public String getName(){
        return lastName;
    }

    /**
     * Getting date of Person
     * @return
     */
    public LocalDate getDate(){
        return dateBirthday;
    }

    /**
     * Show Current Age
     * @param dateBirthday
     * @return
     */
    int CurrentAge(LocalDate dateBirthday){
        return LocalDate.now().getYear() - dateBirthday.getYear();
    }
    
}
