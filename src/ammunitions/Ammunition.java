package ammunitions;

import java.util.Comparator ;

abstract public class Ammunition {
    private int priceEuro;

    private int weightGrams;

    public Ammunition() {
    }

    public Ammunition(int priceEuro, int weightGrams) {
        this.priceEuro = priceEuro;
        this.weightGrams = weightGrams;
    }

    public int getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(int priceEuro) {
        this.priceEuro = priceEuro;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(int weightGrams) {
        this.weightGrams = weightGrams;
    }




    @Override
    public String toString() {
        return
                "priceEuro=" + priceEuro +
                        ", weightGrams=" + weightGrams +
                        '}';
    }




}
