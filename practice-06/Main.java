import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        GeneralTree<String> t = new GeneralTree<>();
        t.add("0");
        t.add("1");
        t.add("2");
        t.add("3");
        t.addRoot("A");
        t.add("a1");
        t.add("a2");
        t.addRoot("B");
        t.add("b1");
        t.add("b2");
        t.add("b3");
        t.addRoot("C");
        t.add("c1");

        Iterator<TNode> preOrder = t.preOrder();
        while (preOrder.hasNext()){
            System.out.print(preOrder.next());
        }

        System.out.println();

        Iterator<TNode> postOrder = t.postOrder();
        while (postOrder.hasNext()){
            System.out.print(postOrder.next());
        }

        System.out.println();

        Iterator<TNode> hasSiblings = t.hasSiblings();
        while (hasSiblings.hasNext()){
            System.out.print(hasSiblings.next());
        }

        System.out.println();
    }
}