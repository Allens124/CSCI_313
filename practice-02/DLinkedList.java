public class DLinkedList<T>{
    // instance variables
    private DNode<T> header;
    private DNode<T> tailer;
    private int size;

    // constructor
    public DLinkedList(){
        header = new DNode<>(null, null, null);
        tailer = new DNode<>(null, null, header);
        header.setNext(tailer);
        size = 0;
    }

    // addAfter() method
    public void addAfter(DNode<T> n, T d) throws Exception{
        if (n == null || n == tailer){
            throw new Exception("Invalid node.");
        }
        DNode<T> nn = new DNode<>(d, n.getNext(), n);
        n.getNext().setPrev(nn);
        n.setNext(nn);
        size++;
    }

    // addBefore() method
    public void addBefore(DNode<T> n, T d) throws Exception{
        if (n == null || n == header){
            throw new Exception("Invalid node.");
        }
        DNode<T> nn = new DNode<>(d, n, n.getPrev());
        n.getPrev().setNext(nn);
        n.setPrev(nn);
        size++;
    }

    // append() method
    public void append(T d){
        DNode<T> nn = new DNode<>(d, tailer, tailer.getPrev());
        tailer.getPrev().setNext(nn);
        tailer.setPrev(nn);
        size++;
    }

    // prepend() method
    public void prepend(T d){
        DNode<T> nn = new DNode<>(d, header.getNext(), header);
        header.getNext().setPrev(nn);
        header.setNext(nn);
        size++;
    }

    // remove() method
    public T remove(DNode<T> n) throws Exception{
        if (size == 0){
            throw new Exception("List is empty.");
        }
        T ans = n.getData();
        n.getPrev().setNext(n.getNext());
        n.getNext().setPrev(n.getPrev());
        size--;
        return ans;
    }

    // print() method
    public void print(){
        DNode<T> current = header.getNext();
        while (current.getNext() != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}