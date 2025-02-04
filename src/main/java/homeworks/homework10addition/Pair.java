package homeworks.homework10addition;

import java.util.Objects;

public class Pair<F, S> {
    private final F first;

    private final S second;

    private Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second){
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }


}
