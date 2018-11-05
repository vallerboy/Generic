package task3;

public class MinMax<C> {
    private C first;
    private C last;

    public MinMax(C first, C last) {
        this.first = first;
        this.last = last;
    }

    public C getFirst() {
        return first;
    }

    public void setFirst(C first) {
        this.first = first;
    }

    public C getLast() {
        return last;
    }

    public void setLast(C last) {
        this.last = last;
    }
}
