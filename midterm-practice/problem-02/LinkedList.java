public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList(){
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        size = 0;
    }

    public void addHead(T d){
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

    public void addTail(T d){
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

    public T removeHead() throws Exception{
        if (size == 0){
            throw new Exception("List is empty.");
        }
        T ans = head.getData();
        head = head.getNext();
        size--;
        return ans;
    }

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

    public void printList(){
        String result = "";
        if (size == 0){
            System.out.println(result);
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null){
            result += current.getData();
            result += "->";
            current = current.getNext();
        }
        result += current.getData();
        System.out.println(result);
    }
}