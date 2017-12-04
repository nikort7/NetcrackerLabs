package Sort;

import Compare.PersonComporator;
import Field.Person;

public class SelectedSort implements Sorter {
    public Person[] sort(Person[] list, PersonComporator comporator) {
        for (int i = 0; i < list.length; i++) {
            // предпологаем, что начальный элемент рассматриваемого фрагмента и будет минимальным
            Person min = list[i]; // предполагаемый минимальный элемент
            int imin = i;   // индекс минимального жлемента

            // Просматриваем оставшийся фрагмент массива и ищем там элемент, меньший предположенного минимума.
            for (int j = i + 1; j < list.length; j++) {
                //Если находим новый минимум, то запоминаем его индекс
                //И обновляем значение минимума
                if (comporator.compare(list[j], min)) {
                    min = list[j];
                    imin = j;
                }
            }

            //Проверяем, нашелся ли элемент меньше, чем стоит на текущей позиции.
            // Если нашелся, то меняем элементы местами
            if (i != imin) {
                Person temp = list[i];
                list[i] = list[imin];
                list[imin] = temp;
            }
        }
        return list;
    }
}
