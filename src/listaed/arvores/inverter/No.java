package listaed.arvores.inverter;

public class No<T> {
    private T info;
    private No<T> left;
    private No<T> right;

    public No(T e){
        this.info = e;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No<T> getLeft() {
        return left;
    }

    public void setLeft(No<T> left) {
        this.left = left;
    }

    public No<T> getRight() {
        return right;
    }

    public void setRight(No<T> right) {
        this.right = right;
    }
}
