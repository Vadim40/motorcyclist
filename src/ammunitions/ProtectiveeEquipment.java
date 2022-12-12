package ammunitions;

public class ProtectiveeEquipment extends Ammunition {

    public enum Type {
        HELMET,SHOES,LEATHERJACKET,MOTORJACKET,PROTECTIVEGLOVES
    }

    private int degreeProtection;
    private  int size;
    private Type type;

    public ProtectiveeEquipment() {

    }

    public ProtectiveeEquipment(int priceEuro, int weightGrams, int degreeProtection, int size, Type type) {
        super(priceEuro, weightGrams);
        this.degreeProtection = degreeProtection;
        this.size = size;
        this.type = type;
    }

    public int getDegreeProtection() {
        return degreeProtection;
    }

    public void setDegreeProtection(int degreeProtection) {
        this.degreeProtection = degreeProtection;
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
        return "ProtectiveeEquipment{" +
                "degreeProtection=" + degreeProtection +
                ", size=" + size +
                ", type=" + type +", "+
                super.toString() ;
    }
}
