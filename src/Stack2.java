import java.util.ArrayList;
public class Stack2<E> {
    private ArrayList<E> list;
    public Stack2() {
        list = new ArrayList<E>();
    }
    public void push(E element) {
        list.add(element);
    }
    public E pop() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        return list.remove(list.size() - 1);
    }
    public void empty() {
        list = new ArrayList<E>();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}