package Compare;

import Field.Person;

public class CompareByDate implements PersonComporator{
    
     public boolean compare(Person s1, Person s2){
        if (s1.getDate().compareTo(s2.getDate()) < 0)
            return true;
        else
            return false;
    }    
}
