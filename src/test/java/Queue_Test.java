import Cola_tiposgenericos.QueueImpl;
import org.junit.Test;
import static org.junit.Assert.*;
public class Queue_Test {
    //Creamos una cola de longitud 3
    private final QueueImpl Queue_TEST = new QueueImpl(3);

    //Hacemos un test para comprobar la funcion size
    @Test
    public void test_size() throws Exception {
        int a = 0, b = 1, c = 2, d = 3;

        Queue_TEST.push(a);
        Queue_TEST.push(b);
        Queue_TEST.push(c);

        //Le decimos que lo que esperamos es que salga 3 y le ponemos la función que le devuelve el size.
        assertEquals(3,Queue_TEST.size());
    }

    //Hacemos un test para comprobar la función pop
    @Test
    public void test_pop() throws Exception{
        int a = 0, b = 1, c = 2;

        Queue_TEST.push(c);
        Queue_TEST.push(b);
        Queue_TEST.push(a);

        assertEquals(c, Queue_TEST.pop());
    }

    //Hacemos un test para comprobar la función push
    //Hacemos que la función push retorne el elemento insertado para poder comprobarlo
    //No se si se puede hacer el assertEquals con un void
    /*
    @Test
    public void test_push() throws Exception {
        int a = 0, b = 1, c = 2, d = 3;
        assertEquals(a, Queue_TEST.push(a));
    }
    */

}