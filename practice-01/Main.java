public class Main{
    public static void main(String[] args){
        LinkedList<String> abcd = new LinkedList<>();

        abcd.append("A");
        abcd.append("B");
        abcd.append("C");
        abcd.prepend("X");
        abcd.prepend("Y");
        abcd.prepend("Z");

        abcd.printList();
    }
}