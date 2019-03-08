package Cola_tiposgenericos;

public interface Queue <E> {

    //Put an element into the queue final position
    E push (E e) throws QueueFullException;

    //Get the first element of the queue and shifts other elements
    E pop ();

    //Get the number of elements in the queue
    int size();

}
