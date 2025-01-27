package generic;

public class Pair<T, U> {
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    private T first;
    private U second;

    public T getFirst(String hello) {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond(int i) {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
