package homeworks.homework9.Racing;

import java.util.Arrays;
import java.util.Objects;

public class Race {
    private int length;
    private String route;
    private int reward;
    String [] racers;

    public Race(Integer length, String route, Integer reward) {
    }

    public String[] getRacers() {
        return racers;
    }

    public void setRacers(String[] racers) {
        this.racers = racers;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return length == race.length && reward == race.reward && Objects.equals(route, race.route) && Objects.deepEquals(racers, race.racers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, route, reward, Arrays.hashCode(racers));
    }

    @Override
    public String toString() {
        return "Race{" +
                "length=" + length +
                ", route='" + route + '\'' +
                ", reward=" + reward +
                ", racers=" + Arrays.toString(racers) +
                '}';
    }
}
