import java.util.ArrayList;
import java.util.Iterator;

public class GTNode<T> implements TNode{
    private T data;
    private GTNode<T> parent;
    private ArrayList<TNode> children;

    public GTNode(T data, GTNode<T> parent){
        this.data = data;
        this.parent = parent;
        children = new ArrayList<>();
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setParent(GTNode<T> parent){
        this.parent = parent;
    }

    public TNode getParent(){
        return parent;
    }

    public Iterator<TNode> getChildren(){
        return children.iterator();
    }

    public String toString(){
        return data.toString();
    }

    public void add(GTNode<T> n){
        children.add(n);
    }

    public void addAt(int i, GTNode<T> n){
        children.add(i, n);
    }

    public void remove(GTNode<T> n){
        children.remove(n);
    }

    public GTNode<T> get(int i) throws Exception{
        if (i < 0 || i > children.size()){
            throw new IndexOutOfBoundsException();
        }
        return (GTNode<T>) children.get(i);
    }

    public int numberOfChildren(){
        return children.size();
    }

    public int size(){
        int count = 1;
        if (children.size() == 0){
            return 1;
        }
        for (int i = 0; i < children.size(); i++){
            count += ((GTNode<T>) children.get(i)).size();
        }
        return count;
    }
}