public interface Queue<T>{
    public void enqueue(T d);
    public T dequeue() throws Exception;
    public int size();
    public boolean isEmpty();
}