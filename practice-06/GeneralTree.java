public class GeneralTree<T> extends Tree{
    public GeneralTree(){
        super();
    }

    public void addRoot(T d){
        GTNode<T> n = new GTNode<>(d, null);
        if (root != null){
            n.add((GTNode<T>) root);
        }
        root = n;
        size++;
    }

    public void add(T d){
        if (root == null){
            addRoot(d);
            return;
        }
        GTNode<T> n = new GTNode<>(d, (GTNode<T>) root);
        ((GTNode<T>) root).add(n);
        size++;
    }

    public void addTo(GTNode<T> n, T d) throws Exception{
        if (n == null){
            throw new Exception("Invalid input.");
        }
        GTNode<T> c = new GTNode<>(d, n);
        n.add(c);
        size++;
    }

    public void addAt(GTNode<T> n, int i, T d) throws Exception{
        if (n == null || i < 0 || i > n.numberOfChildren()){
            throw new Exception("Invalid input.");
        }
        GTNode<T> c = new GTNode<>(d, n);
        n.addAt(i, c);
        size++;
    }

    public void remove(GTNode<T> n) throws Exception{
        if (n == null){
            throw new Exception("Invalid input.");
        }
        if (n == root){
            root = null;
            size = 0;
            return;
        }
        size -= n.size();
        ((GTNode<T>) n.getParent()).remove(n);
    }
}