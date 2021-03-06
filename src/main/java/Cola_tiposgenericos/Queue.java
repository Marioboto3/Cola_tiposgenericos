package Cola_tiposgenericos;

public interface Queue <E> {

    //Put an element into the queue final position
    void push(E e) throws QueueFullException;

    //Get the first element of the queue and shifts other elements
    E pop() throws  QueueEmptyException;

    //Get the number of elements in the queue
    int size();

}
