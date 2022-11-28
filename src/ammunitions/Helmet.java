package ammunitions;
public class Helmet extends Ammunition{
    public Helmet() {
    }

    public Helmet(int priceEuro, int weightGrams, Producer producer) {
        super(priceEuro, weightGrams, producer);
    }

    @Override
    public String toString() {
        return "Helmet{" + super.toString();

    }
}
