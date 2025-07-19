import java.util.ArrayList;
import java.util.Iterator;

public class BTNode<T> implements TNode{
    private T data;
    private BTNode<T> parent;
    private BTNode<T> left;
    private BTNode<T> right;

    public BTNode(T data, BTNode<T> parent){
        this.data = data;
        this.parent = parent;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setParent(BTNode<T> parent){
        this.parent = parent;
    }

    public BTNode<T> getParent(){
        return parent;
    }

    public void setLeft(BTNode<T> left){
        this.left = left;
    }

    public BTNode<T> getLeft(){
        return left;
    }

    public void setRight(BTNode<T> right){
        this.right = right;
    }

    public BTNode<T> getRight(){
        return right;
    }

    public Iterator<TNode> getChildren(){
        ArrayList<TNode> children = new ArrayList<>();
        children.add(left);
        children.add(right);
        return children.iterator();
    }

    public String toString(){
        return data.toString();
    }

    public int numberOfChildren(){
        return (left == null ? 0 : 1) + (right == null ? 0 : 1);
    }

    public int size(){
        if (numberOfChildren() == 0){
            return 1;
        }
        int leftSize = left == null ? 0 : left.size();
        int rightSize = right == null ? 0 : right.size();
        return 1 + leftSize + rightSize;
    }
}