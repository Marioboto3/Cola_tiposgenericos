package Cola_tiposgenericos;

public class QueueImpl <E> implements Queue <E> {

    //Attributes
    E[] data;       //Queue
    int p;          //Number of elements

    //Constructor
    public QueueImpl(int len) {
        this.data = (E[]) new Object[len];
    }

    //Push Method
    public void push(E e) throws QueueFullException {
        if (this.isFull()) throw new QueueFullException();
        this.data[this.p++] = e;
    }

    //Pop Method
    public E pop() throws QueueEmptyException {
        if (this.isEmpty()) throw new QueueEmptyException();
        E first = this.data[0];
        shift();
        this.p--;
        return first;
    }

    //Size Method
    public int size() {
        return this.p;
    }

    //isFull
    private boolean isFull() {
        return (this.size() == this.data.length);
    }

    //isEmpty
    private boolean isEmpty() {
        return (this.p == 0);
    }

    //shift
    private void shift() {
        for (int i = 0; i < this.p; i++) {
            this.data[i] = this.data[i + 1];
        }
    }
}
