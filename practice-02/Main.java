public class Main{
    public static void main(String[] args){
        DLinkedList<String> abc = new DLinkedList<>();

        abc.append("A");
        abc.append("B");
        abc.append("C");
        abc.prepend("X");
        abc.prepend("Y");
        abc.prepend("Z");

        abc.print();
    }
}