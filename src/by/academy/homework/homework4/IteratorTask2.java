package by.academy.homework.homework4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTask2<T> implements Iterator<T> {
    private ArrayList<T> arrList;
    private int counter;

    public IteratorTask2(ArrayList<T> list) {
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
