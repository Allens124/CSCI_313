public class ArrayStack<T> implements Stack<T>{
    private T[] data;
    private int top;
    private int capacity;

    public ArrayStack(){
        data = (T[]) new Object[1000];
        capacity = 1000;
        top = -1;
    }

    public ArrayStack(int capacity){
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T d) throws Exception{
        if (top+1 == capacity){
            throw new Exception("Stack overflow.");
        }
        data[++top] = d;
    }

    public T pop() throws Exception{
        if (top == -1){
            throw new Exception("Stack underflow.");
        }
        T ans = data[top--];
        return ans;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}