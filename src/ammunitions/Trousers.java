package ammunitions;

public class Trousers extends Ammunition {
    public Trousers() {
    }

    public Trousers(int priceEuro, int weightGrams, Producer producer) {
        super(priceEuro, weightGrams, producer);
    }

    @Override
    public String toString() {
        return "Trousers{" + super.toString();
    }
}
