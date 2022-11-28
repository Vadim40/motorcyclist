package ammunitions;

public class Jacket extends Ammunition {
    public Jacket() {
    }

    @Override
    public String toString() {
        return "Jacket{" + super.toString();
    }

    public Jacket(int priceEuro, int weightGrams, Producer producer) {

        super(priceEuro, weightGrams, producer);
    }
}
