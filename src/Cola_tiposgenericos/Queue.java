package Cola_tiposgenericos;

import java.util.Collection;

public interface Queue <E> extends Collection<E> {

    void push (E e);
    E pop ();
    int size();

}
