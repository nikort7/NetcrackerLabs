package Compare;

import Field.Person;

public class CompareByName implements PersonComporator{
    
    public boolean compare(Person s1, Person s2){
        if (s1.getName().compareTo(s2.getName()) < 0)
            return true;
        else
            return false;
    }    
}
