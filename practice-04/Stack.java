public interface Stack<T>{
    public void push(T data) throws Exception;
    public T pop() throws Exception;
    public int size();
    public boolean isEmpty();
}