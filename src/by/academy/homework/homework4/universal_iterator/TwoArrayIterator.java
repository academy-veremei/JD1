package by.academy.homework.homework4.universal_iterator;

public class TwoArrayIterator<T> implements MyUniversalIterator<T> {
    private T[][] array;
    private int counterString;
    private int counterColumn;

    public TwoArrayIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array != null && counterString < array.length && counterColumn < array[counterString].length;
    }

    @Override
    public T next() {
        if (array[counterString][counterColumn] == null) {
            counterColumn++;
        }

        T temp = array[counterString][counterColumn++];

        if (counterColumn >= array[counterString].length) {
            counterString++;
            counterColumn = 0;
        }

        return temp;
    }
}
