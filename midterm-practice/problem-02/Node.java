public class Node <T>{
    // instance variables
    private T data;
    private Node <T> next;

    // no-argument constructor
    public Node(){
        data = null;
        next = null;
    }

    // one-argument constructor
    public Node(T data){
        this.data = data;
        next = null;
    }

    // two-argument constructor
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    // data setter and getter methods
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    // next setter and getter methods
    public void setNext(Node<T> next){
        this.next = next;
    }
    public Node<T> getNext(){
        return next;
    }
}