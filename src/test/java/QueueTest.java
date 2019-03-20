import Cola_tiposgenericos.QueueImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {
    //Creamos una cola de longitud 3
    private QueueImpl queueTest = null;

    @Before
    public void initialize () {
        queueTest = new QueueImpl(3);
    }

    @After
    public void tearDown () {
        queueTest = null;
    }

    //Hacemos un test para comprobar la funcion size
    @Test
    public void testSize() throws Exception {
        int a = 0, b = 1, c = 2, d = 3;

        queueTest.push(a);
        queueTest.push(b);
        queueTest.push(c);

        //Le decimos que lo que esperamos es que salga 3 y le ponemos la función que le devuelve el size.
        assertEquals(3,queueTest.size());
    }

    //Hacemos un test para comprobar la función pop
    @Test
    public void testPop() throws Exception{
        int a = 0, b = 1, c = 2;

        queueTest.push(c);
        queueTest.push(b);
        queueTest.push(a);

        assertEquals(c, queueTest.pop());
    }

    @Test
    public void testPush() throws Exception {
        int a = 0, b = 1, c = 2, d = 3;

        queueTest.push(a);
        assertEquals(a,queueTest.pop());
    }
}