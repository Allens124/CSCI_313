public class Main{
    public static void main(String[] args){
        LinkedList<String> ls = new LinkedList<>();
        
        ls.addHead("5");
        ls.addHead("4");
        ls.addHead("3");
        ls.addHead("2");
        ls.addHead("1");

        ls.printList();

        ls.moveLastToFirst();

        ls.printList();
    }
}