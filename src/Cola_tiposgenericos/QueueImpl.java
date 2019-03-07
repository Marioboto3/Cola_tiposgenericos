package Cola_tiposgenericos;

public class QueueImpl <E> implements Queue <E> {

    //Attributes
    E[] data;       //Queue
    int p;          //Number of elements

    //Constructor
    public QueueImpl(int len) {
        this.data = (E[]) new Object[len];
    }

    //isFull
    private boolean isFull() {
        return (this.size() == this.data.length);
    }

    //isEmpty
    private boolean isEmpty() {
        return (this.p == 0);
    }

    //Push Method
    @Override
    public void push(E e) throws QueueFullException {
        if (this.isFull()) throw new QueueFullException("Queue is full");
        this.data[this.p++] = e;
    }

    //Pop Method
    @Override
    public E pop() //TODO: throws QueueEmptyException {
        if (this.isEmpty()) //TODO: throw new QueueEmptyException();
        E first = this.data[0];
        //TODO: Shift
        this.p--;
        return first;
    }

    //Size Method
    @Override
    public int size() {
        return this.p;
    }
}
