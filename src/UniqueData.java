public class UniqueData<T, C> {
    private T data;
    private C dataTwo;

    public UniqueData(T data) {
        this.data = data;
    }

    public void setDataTwo(C dataTwo){
        this.dataTwo = dataTwo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
