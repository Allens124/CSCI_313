import java.util.ArrayList;
import java.util.Iterator;

public class Tree{
    protected TNode root;
    protected int size;

    public Tree(){
        root = null;
        size = 0;
    }

    public TNode getRoot(){
        return root;
    }

    public int getSize(){
        return size;
    }

    public boolean hasRoot(){
        return root != null;
    }

    public boolean isRoot(TNode t){
        return t == root;
    }

    public boolean isLeaf(TNode t){
        return !t.getChildren().hasNext();
    }

    public int height(TNode t){
        if (isLeaf(t)){
            return 0;
        }
        int maxHeight = 0;
        Iterator<TNode> c = t.getChildren();
        while (c.hasNext()){
            int tempHeight = height(c.next());
            if (tempHeight > maxHeight){
                maxHeight = tempHeight;
            }
        }
        return 1 + maxHeight;
    }

    public int depth(TNode t){
        if (isRoot(t)){
            return 0;
        }
        return 1 + depth(t.getParent());
    }

    public Iterator<TNode> preOrder(){
        ArrayList<TNode> answer = new ArrayList<>();
        preOrder(root, answer);
        return answer.iterator();
    }

    private void preOrder(TNode node, ArrayList<TNode> order){
        if (isLeaf(node)){
            order.add(node);
            return;
        }
        Iterator<TNode> current = node.getChildren();
        order.add(node);
        while(current.hasNext()){
            preOrder(current.next(), order);
        }
    }

    public Iterator<TNode> postOrder(){
        ArrayList<TNode> answer = new ArrayList<>();
        postOrder(root, answer);
        return answer.iterator();
    }

    private void postOrder(TNode node, ArrayList<TNode> order){
        if (isLeaf(node)){
            order.add(node);
            return;
        }
        Iterator<TNode> current = node.getChildren();
        while(current.hasNext()){
            postOrder(current.next(), order);
        }
        order.add(node);
    }

    public Iterator<TNode> inOrder(){
        ArrayList<TNode> answer = new ArrayList<>();
        inOrder(root, answer);
        return answer.iterator();
    }

    private void inOrder(TNode node, ArrayList<TNode> order){
        if (isLeaf(node)){
            order.add(node);
            return;
        }
        Iterator<TNode> current = node.getChildren();
        inOrder(current.next(), order);
        order.add(node);
        while(current.hasNext()){
            inOrder(current.next(), order);
        }
    }

    public Iterator<TNode> hasSiblings(){
        ArrayList<TNode> ans = new ArrayList<>();
        hasSiblings(root, ans);
        return ans.iterator();
    }

    private void hasSiblings(TNode node, ArrayList<TNode> order){
        if (isLeaf(node)){
            return;
        }
        Iterator<TNode> c = node.getChildren();
        TNode firstChild = c.next();
        if (c.hasNext()){
            order.add(firstChild);
            while (c.hasNext()){
                order.add(c.next());
            }
        }
        c = node.getChildren();
        while (c.hasNext()){
            hasSiblings(c.next(), order);
        }
    }
}