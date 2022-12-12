package ammunitions;

public class LightEquipment extends Ammunition{
    private int convenience;
    private int size;
    private LightEquipmentTypes type;
    LightEquipment(){

    }

    public LightEquipment(int priceEuro, int weightGrams, int convenience, int size, LightEquipmentTypes type) {
        super(priceEuro, weightGrams);
        this.convenience = convenience;
        this.size = size;
        this.type = type;
    }

    public int getConvenience() {
        return convenience;
    }

    public void setConvenience(int convenience) {
        this.convenience = convenience;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LightEquipmentTypes getType() {
        return type;
    }

    public void setType(LightEquipmentTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LightEquipment{" +
                "convenience=" + convenience +
                ", size=" + size +
                ", type=" + type +
                 super.toString();
    }
}
