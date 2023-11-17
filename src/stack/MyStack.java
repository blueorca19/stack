package stack;

import interfaces.MyCollection;

import java.util.Objects;


public class MyStack<T> implements MyCollection<T> {
    private Object[] elements = new Object[7];
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T element) { //добавить элемент
        if (size == elements.length) {
            System.out.println("Стек переполнен");
            return;
        }
        if (element == null) {
            System.out.println("Добавляемый элемент не может быть null");
            return;
        }
        elements[size++] = element;
    }

    @Override
    public T pop() {   //удалить элемент
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return null;
        }
        size--;
        T element = (T) elements[size];
        elements[size] = null;
        return element;

    }

    @Override
    public T peek() { //отдать элемент, но не удалять
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return null;
        }

        return (T) elements[size - 1];

    }

    @Override
    public int search(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return size - i; //вычисляем и возвращаем порядковый номер элемента относительно вершины стека
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}