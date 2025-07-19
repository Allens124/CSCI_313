public class CLinkedList<T>{
    // instance variables
    private DNode<T> sent;
    private int size;

    // constructor
    public CLinkedList(){
        sent = new DNode<>(null, null, null);
        size = 0;
    }
}
