package ammunitions;


public class LightEquipment extends Ammunition{
    public enum Type {
        TEXTILEPANTS,TEXTILEJACKET,MITTEN,TSHIRT
    }

    private int convenience;
    private int size;
    private Type type;
    LightEquipment(){

    }

    public LightEquipment(int priceEuro, int weightGrams, int convenience, int size, Type type) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LightEquipment{" +
                "convenience=" + convenience +
                ", size=" + size +
                ", type=" + type +", "+
                super.toString();
    }
}
