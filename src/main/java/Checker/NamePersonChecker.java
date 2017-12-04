package Checker;

import Field.Person;

public class NamePersonChecker implements PersonChecker {

    public boolean check(Person p, Object value) {
        if(p.getName().equals(value)){
            return true;
        }
        return false;
    }
}
