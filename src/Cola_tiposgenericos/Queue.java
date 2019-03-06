package Cola_tiposgenericos;

public interface Queue <E> {

    public void push (E e) throws QueueFullException;
    E pop ();
    int size();

}
