package ammunitions;
public class Shoes extends Ammunition{
    public Shoes() {
    }

    public Shoes(int priceEuro, int weightGrams, Producer producer) {
        super(priceEuro, weightGrams, producer);
    }

    @Override
    public String toString() {
        return "Shoes{" +super.toString();
    }
}
