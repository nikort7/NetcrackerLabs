package Compare;

import Field.Person;

public class CompareByID implements PersonComporator{
      
    public boolean compare(Person s1, Person s2){
        if (s1.getID() < s2.getID())
            return true;
        else
            return false;
    } 
}
