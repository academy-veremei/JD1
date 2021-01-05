//Для 4й домашки и на будущее
package by.academy.homework.homework4.universal_iterator;

import java.util.Iterator;

public interface MyUniversalIterator<T> extends Iterator<T> {
    @Override
    boolean hasNext();

    @Override
    T next();
}
