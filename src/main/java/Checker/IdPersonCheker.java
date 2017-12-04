package Checker;

import Field.Person;

public class IdPersonCheker implements PersonChecker {

    public boolean check(Person p, Object value) {
        if(p.getID() == Integer.parseInt(value.toString())){
            return true;
        }
        return false;
    }
}
