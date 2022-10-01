package Model;

public class List<T> {
    private Node<T> head;
    private Node<T> end;
    private int length;

    public List() {
        this.head = null;
        this.end = null;
    }

    public int length() {
        return length;
    }

    public Node<T> getElement(int index) {
        Node<T> actual = head;
        for(int i = 0; i < index; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public T valueOf(int index) {
        Node<T> target = getElement(index);
        return target.getValue();
    }

    public int indexOf(T target) {
        Node<T> actual = head;
        for(int i = 0; i < length - 1; i++) {
            if(actual.getValue() == target) {
                return i;
            }
            else {
                actual = actual.getNext();
            }
        }
        return -1;
    }

    public void push(T newValue) {
        if(head == null) {
            head = new Node<T>(newValue);
            end = head;
        }
        else {
            end.setNext(new Node<T>(newValue));
            end = end.getNext();
        }
        length++;
    }

    public void insert(T newValue, int index) {
        Node<T> actual = getElement(index);
        Node<T> prev = getElement(index - 1);
        Node<T> newNode = new Node<T>(newValue);
        prev.setNext(newNode);
        newNode.setNext(actual);
        length++;
    }

    public T pop() {
        if(head != null) {
            T value = end.getValue();
            Node<T> end = getElement(length - 2);
            end.setNext(null);
            System.gc();
            length--;
            return value;
        }
        return null;
    }

    public void del(int index) {
        Node<T> actual = getElement(index);
        Node<T> prev = getElement(index - 1);
        prev.setNext(actual.getNext());
        System.gc();
        length--;
    }

    public void showList() {
        Node<T> actual = head;
        System.out.print("[");
        for(int i = 0; i < length; i++) {
            System.out.print(actual.getValue());
            if(i < length - 1) {
                System.out.print(", ");
            }
            actual = actual.getNext();
        }
        System.out.print("]\n");
    }

}
