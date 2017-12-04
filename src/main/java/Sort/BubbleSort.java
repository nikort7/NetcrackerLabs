package Sort;

import Compare.PersonComporator;
import Field.Person;

public class BubbleSort implements Sorter {

    public Person[] sort(Person[] list, PersonComporator comporator) {
        Person temp; // временная переменная для обмена элементов местами
        for(int i = 0; i < list.length - 1; ++i) // i - номер прохода
        {
            for(int j = 0; j < list.length - 1; ++j) // внутренний цикл прохода
            {
                if (comporator.compare(list[j + 1], list[j]))
                {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
