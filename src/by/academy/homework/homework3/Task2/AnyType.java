package by.academy.homework.homework3.Task2;

import java.util.Arrays;

public class AnyType<T> {
    private T[] anyTypeBox;
    private int freeCellIndex = 0;

    public AnyType() {
        super();
        anyTypeBox = (T[]) new Object[16];
    }

    public AnyType(int size) {
        super();
        anyTypeBox = (T[]) new Object[size];
    }

    public T[] getArr() {
        return anyTypeBox;
    }

    public void setArr(T[] arr) {
        this.anyTypeBox = arr;
    }

    public void addToBox(T object) {
        if (anyTypeBox.length == freeCellIndex) {
            anyTypeBox = Arrays.copyOf(anyTypeBox, anyTypeBox.length * 2 + 1);
        }
        anyTypeBox[freeCellIndex++] = object;
    }

    public T getFromBoxByIndex(int index) {
        if (index >= 0 && index < anyTypeBox.length) {
            return anyTypeBox[index];
        } else {
            System.out.println("ERROR");
            return null;
        }
    }

    public T getLast() {
        return anyTypeBox[anyTypeBox.length - 1];
    }

    public T getFirst() {
        return anyTypeBox[0];
    }

    public void printBoxSize() {
        System.out.println("Размер массива: " + anyTypeBox.length);
    }

    public void printIndexOfLastFilledElement() {
        System.out.println(freeCellIndex - 1);
    }

    public void deleteFromBoxByIndex(int index) {
        if (index < 0 || index > anyTypeBox.length - 1 || anyTypeBox[index] == null) {
            System.out.println("ERROR");
        } else if (index == anyTypeBox.length - 1) {
            anyTypeBox[index] = null;
            System.out.println("Элемент удален.");
            updateFreeCellIndex();
        } else {
            System.arraycopy(anyTypeBox, index + 1, anyTypeBox, index, anyTypeBox.length - index - 1);
            anyTypeBox[anyTypeBox.length - 1] = null;
            System.out.println("Элемент удален.");
            updateFreeCellIndex();
        }
    }

    public void updateFreeCellIndex() {
        for (int i = anyTypeBox.length - 1; i != 0; i--) {
            if (freeCellIndex == 0) {
                break;
            }
            if (anyTypeBox[i] != null) {
                freeCellIndex = i + 1;
            }
        }
    }

    public void deleteFromBoxByValue(T value) {
        for (int i = 0; i < anyTypeBox.length; i++) {
            if (value.equals(anyTypeBox[i])) {
                deleteFromBoxByIndex(i);
                break;
            }
        }
    }

}
