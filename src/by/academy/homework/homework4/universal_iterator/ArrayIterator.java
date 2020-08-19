package by.academy.homework.homework4.universal_iterator;

public class ArrayIterator<T> implements MyUniversalIterator<T> {
    private T[] array;
    private int counter;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array != null && array.length > counter;
    }

    @Override
    public T next() {
        if (array[counter] == null) {
            counter++;
        }
        return array[counter++];
    }
}
