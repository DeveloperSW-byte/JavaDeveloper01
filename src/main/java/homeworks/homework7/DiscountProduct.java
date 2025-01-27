package homeworks.homework7;

import java.util.Objects;

public class DiscountProduct extends product{
    @Override
    public String toString() {
        return "DiscountProduct{" +
                "discount=" + discount +
                '}';
    }

    private int discount;


    public DiscountProduct(String name, Integer price, Integer discount) {
        super(name, price);
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountProduct that = (DiscountProduct) o;
        return discount == that.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}

