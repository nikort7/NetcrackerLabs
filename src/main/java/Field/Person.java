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

    public void setID(int id){
        this.id = id;
    }
    public void setName(String lastName){
        this.lastName = lastName;
    }
    public void setDate(LocalDate dateBirthday){
        this.dateBirthday = dateBirthday;
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return lastName;
    }
    public LocalDate getDate(){
        return dateBirthday;
    }

    public Person(){
        this.dateBirthday = dateBirthday;
        this.lastName = lastName;
        this.id = id;
    }
    
    int CurrentAge(LocalDate dateBirthday){
        return LocalDate.now().getYear() - dateBirthday.getYear();
    }
    
}
