import java.util.Iterator;

public class ItQueue<T> extends LinkedQueue<T> implements Iterable<T>{
    public ItQueue(){
        super();
    }

    public Iterator<T> iterator(){
        return new QueueIterator<>(front);
    }
}