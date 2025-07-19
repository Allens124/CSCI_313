import java.util.Iterator;

public class QueueIterator<T> implements Iterator<T>{
    private Node<T> current;

    public QueueIterator(Node<T> current){
        this.current = current;
    }

    public T next(){
        T ans = current.getData();
        current = current.getNext();
        return ans;
    }

    public boolean hasNext(){
        return current != null;
    }
}