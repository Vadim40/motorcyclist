package ammunitions;

import java.util.Arrays;

public class FirstAidKit extends Ammunition{
    public enum MedicalPreparation {
        BANDAGES,PAINKILLER,ADRENALIN,HARNESS,AMMONIA
    }

    MedicalPreparation[] content;
    public FirstAidKit(int priceEuro, int weightGrams, MedicalPreparation[] content) {
        super(priceEuro, weightGrams);
        this.content = content;
    }

    public MedicalPreparation[] getContent() {
        return content;
    }

    public void setContent(MedicalPreparation[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FirstAidKit{" +
                "content=" + Arrays.toString(content) +", "+ super.toString()
                ;
    }
}
