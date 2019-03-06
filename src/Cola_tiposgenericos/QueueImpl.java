package Cola_tiposgenericos;

public class QueueImpl <E> implements Queue <E> {

    E[] data;
    int p;

    public QueueImpl(int len) {
        this.data = (E[])  new Object[len];
    }

    @Override
    public void push(E e) throws QueueFullException {
        if (isFull()) throw new QueueFullException();

        this.data[this.p++] = e;
    }

    @Override
    public E pop() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException()
        E primer = this.data[0];
        lshift();
        this.p--;
        return primer;
    }

    @Override
    public int size() {
        return this.p;
    }
}
