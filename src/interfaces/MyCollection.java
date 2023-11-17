package interfaces;

public interface MyCollection<T> {

    int size();

    boolean isEmpty();

    void push(T element);

    T pop();

    T peek();

    int search(T element);
}