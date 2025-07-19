public class LinkedList<T>{
    // instance variables
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // constructor
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // append() method
    public void append(T d){
        Node<T> nn = new Node<>(d, null);
        if (size == 0){
            head = nn;
        }
        else{
            tail.setNext(nn);
        }
        tail = nn;
        size++;
    }

    // prepend() method
    public void prepend(T d){
        Node<T> nn = new Node<>(d, null);
        if (size == 0){
            tail = nn;
        }
        else{
            nn.setNext(head);
        }
        head = nn;
        size++;
    }

    // removeHead() method
    public T removeHead() throws Exception{
        if (size == 0){
            throw new Exception("List is empty.");
        }
        T ans = head.getData();
        head = head.getNext();
        size--;
        return ans;
    }

    // removeTail() method
    public T removeTail() throws Exception{
        if (size == 0){
            throw new Exception("List is empty.");
        }
        T ans = tail.getData();
        if (size == 1){
            head = null;
            tail = null;
            size--;
            return ans;
        }
        Node<T> current = head;
        while (current.getNext() != tail){
            current = current.getNext();
        }
        tail = current;
        tail.setNext(null);
        size--;
        return ans;
    }

    // printList() method
    public void printList(){
        if (size == 0){
            System.out.println("List is empty.");
        }
        Node<T> current = head;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}