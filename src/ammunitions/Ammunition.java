package ammunitions;

import java.util.Comparator ;

abstract public class Ammunition {
    private int priceEuro;

    private int weightGrams;
    private Producer producer;

    public Ammunition() {
    }

    public Ammunition(int priceEuro, int weightGrams, Producer producer) {
        this.priceEuro = priceEuro;
        this.weightGrams = weightGrams;
        this.producer = producer;
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


    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return
                "priceEuro=" + priceEuro +
                        ", weightGrams=" + weightGrams +
                        ", producer=" + producer +
                        '}';
    }




}
