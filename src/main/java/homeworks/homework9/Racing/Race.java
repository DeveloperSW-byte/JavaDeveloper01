package homeworks.homework9.Racing;

import java.util.Arrays;
import java.util.Objects;

public class Race {
    private int length;
    private String route;
    private int reward;
    private List<Car> racers;

    public Race(Integer length, String route, Integer reward, Object racers) {
        this.racers = new ArrayList<>();
    }

    public void racers (Car car){
        racers.add(car);
        System.out.println("Машина " + car.getBrand() + " " + car.getModel() + "участвует в гонке");
    }

    public void showRacers() {
        if (racers.isEmpty()) {
            System.out.println("Гараж пуст ");
        } else {
            System.out.println("Список гонщиков ");
            for (Car car : racers) {
                System.out.println(car);
            }
        }
    }

    public void winner(List<Car> racers, int hpThreshold) {
        for (Car car : racers) {
            if (car.getHP() > hpThreshold) {
                System.out.println("Машины призеры " + car.getModel());
            }
        }
    }

    public void findMostPowerfulCar(List< Car > cars) {
        if (cars.isEmpty()) {
            System.out.println("Список машин пуст.");
            return;
        }

        Car mostPowerfulCar = cars.get(0);

        for (Car car : cars) {
            if (car.getHP() > mostPowerfulCar.getHP()) {
                mostPowerfulCar = car;
            }
        }

        System.out.println("Победитель" + mostPowerfulCar);
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
