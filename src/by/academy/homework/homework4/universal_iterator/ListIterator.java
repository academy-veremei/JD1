package by.academy.homework.homework4.universal_iterator;

import java.util.ArrayList;

public class ListIterator<T> implements MyUniversalIterator<T> {
    private ArrayList<T> arrList;
    private int counter;

    public ListIterator(ArrayList<T> list) {
        arrList = new ArrayList<>(list);
    }

    @Override
    public boolean hasNext() {
        return arrList != null && counter < arrList.size();
    }

    @Override
    public T next() {

        if (arrList.get(counter) == null) {
            counter++;
        }

        return arrList.get(counter++);
    }
}
