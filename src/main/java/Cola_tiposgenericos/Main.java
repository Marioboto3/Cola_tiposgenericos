package Cola_tiposgenericos;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queueInt = new QueueImpl<Integer>(10);
        Queue<String> queueString = new QueueImpl<String>(4);
    }
}
