public class LinkedList<T>{
    private Node<T> head;

    public LinkedList(){
        head = null;
    }

    public void addHead(T d){
        Node<T> n = new Node<>(d, head);
        head = n;
    }

    public void printList(){
        String list = "";
        if (head == null){
            System.out.println(list);
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null){
            list += current.getData();
            list += "->";
            current = current.getNext();
        }
        list += current.getData();
        System.out.println(list);
    }

    public void moveLastToFirst(){
        if (head == null){
            return;
        }
        Node<T> current = head;
        T newData = current.getData();
        T currentData = current.getData();
        while (current != null){
            currentData = current.getData();
            current.setData(newData);
            newData = currentData;
            current = current.getNext();
        }
        head.setData(newData);
    }
}