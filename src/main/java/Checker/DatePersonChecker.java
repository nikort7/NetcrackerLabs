package Checker;

import Field.Person;

public class DatePersonChecker implements PersonChecker {

    public boolean check(Person p, Object value) {
        if(p.getDate().equals(value)){
            return true;
        }
        return false;
    }
}