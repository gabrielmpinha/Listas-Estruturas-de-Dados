package listaed.listas.cacaniquel;

public class No {

    No prior;
    No next;
    String data;

    public No(String data) {
        this.data = data;
    }

    public No getPrior() {
        return prior;
    }

    public void setPrior(No prior) {
        this.prior = prior;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
