package by.academy.homework.homework4;

import java.util.Iterator;

public class IteratorTask1<T> implements Iterator<T> {
    private T[][] array;
    private int counterString;
    private int counterColumn;

    public IteratorTask1(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array != null && counterString < array.length && counterColumn < array[counterString].length
                && array[counterString][counterColumn] != null;
    }

    @Override
    public T next() {
        T temp = array[counterString][counterColumn++];

        if (counterColumn >= array[counterString].length) {
            counterString++;
            counterColumn = 0;
        }

        return temp;
    }
}
