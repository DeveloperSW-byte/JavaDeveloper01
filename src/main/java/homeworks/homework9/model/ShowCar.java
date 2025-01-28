package homeworks.homework9.model;

public class ShowCar extends Car{
    private int stars = 0;

    public ShowCar (String brand, String model, Integer release, Integer HP, Integer acceleration, Integer durability, Integer suspension, Integer stars){
        super(brand, model, release, HP, acceleration, durability, suspension);
        if (stars <= 0) {
            System.out.println("Maaan, you car so ugly");
        }
        if (stars > 0) {
            System.out.println("Looking cool there, bro.");
        }
        this.stars = stars;

    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars <= 0) {
            System.out.println("Maaan, you car so ugly");
        }
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString() + ", stars=" + stars;
    }
}
