package listaed.arvores.contarfolhas;

public class BinaryNode<T> {
    private T info;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T e){
        this.info = e;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
