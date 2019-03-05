package Cola_tiposgenericos;

public interface Queue <E> {

    public void push (E e) throws new IllegalStateException;
    E pop ();
    int size();

}
