public class LinkedStack<T> implements Stack<T>{
    private Node<T> top;
    private int size;

    public LinkedStack(){
        top = null;
        size = 0;
    }

    public void push(T d){
        Node<T> n = new Node<>(d, top);
        top = n;
        size++;
    }

    public T pop() throws Exception{
        if (size == 0){
            throw new Exception("Stack is empty.");
        }
        T ans = top.getData();
        top = top.getNext();
        size--;
        return ans;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}