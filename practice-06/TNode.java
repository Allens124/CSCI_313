import java.util.Iterator;

public interface TNode{
    public String toString();
    public TNode getParent();
    public Iterator<TNode> getChildren();
}