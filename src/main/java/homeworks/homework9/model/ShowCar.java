package homeworks.homework9.model;

public class ShowCar extends Car{
    private int stars = 0;

    public ShowCar (String brand, String model, Integer release, Integer HP, Integer acceleration, Integer durability, Integer suspension, Integer stars){
        super(brand, model, release, HP, acceleration, durability, suspension);
        this.stars = stars;

    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
