public class DNode<T>{
    // instance variables
    private T data;
    private DNode<T> next;
    private DNode<T> prev;

    // constructor
    public DNode(T data, DNode<T> next, DNode<T> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    // data getter and setter methods
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    // next getter and setter methods
    public void setNext(DNode<T> next){
        this.next = next;
    }
    public DNode<T> getNext(){
        return next;
    }

    // prev getter and setter methods
    public void setPrev(DNode<T> prev){
        this.prev = prev;
    }
    public DNode<T> getPrev(){
        return prev;
    }
}