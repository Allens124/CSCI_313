public class LinkedQueue<T> implements Queue<T>{
    protected Node<T> front;
    protected Node<T> rear;
    protected int size;

    public LinkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T d){
        Node<T> n = new Node<>(d, null);
        if (size == 0){
            front = n;
        }
        else{
            rear.setNext(n);
        }
        rear = n;
        size++;
    }

    public T dequeue() throws Exception{
        if (size == 0){
            throw new Exception("Queue is empty.");
        }
        T ans = front.getData();
        front = front.getNext();
        size--;
        if (size == 0){
            rear = null;
        }
        return ans;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}