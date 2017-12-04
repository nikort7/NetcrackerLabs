package Sort;

import Compare.PersonComporator;
import Field.Person;

public class QuickSort implements Sorter {
    public Person[] sort(Person[] list, PersonComporator comporator) {

        int startIndex = 0;
        int endIndex = list.length - 1;
        doSort(list, comporator, startIndex, endIndex);
        
        return list;
    }

    private void doSort(Person[] list, PersonComporator comporator, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (comporator.compare(list[i], list[cur]))) {
                i++;
            }
            while (j > cur && (comporator.compare(list[cur], list[j]))) {
                j--;
            }
            if (i < j) {
                Person temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(list, comporator, start, cur);
        doSort(list, comporator, cur+1, end);
    }
}
