package homeworks.homework10addition;

import java.util.Objects;

public class Pair<i, s> {
    private final i first;

    private final s second;

    public s getSecond() {
        return second;
    }

    public i getFirst() {
        return first;
    }

    private Pair(i first, s second){
        this.first = first;
        this.second = second;
    }

    public static <i, s> Pair<i, s> of(i first, s second){
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
