public class ListAdapterStack<T> implements Stack<T>{
    private LinkedList<T> data;
    private int size;

    public ListAdapterStack(){
        data = new LinkedList<>();
        size = 0;
    }

    public void push(T d){
        data.addHead(d);
        size++;
    }

    public T pop() throws Exception{
        if (size == 0){
            throw new Exception("Stack is empty.");
        }
        T ans = data.removeHead();
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