package ammunitions;

import java.util.Arrays;

public class FirstAidKit extends Ammunition{

    MedicalPreparations[] content;
    public FirstAidKit(int priceEuro, int weightGrams, MedicalPreparations[] content) {
        super(priceEuro, weightGrams);
        this.content = content;
    }

    public MedicalPreparations[] getContent() {
        return content;
    }

    public void setContent(MedicalPreparations[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FirstAidKit{" +
                "content=" + Arrays.toString(content) + super.toString()
                ;
    }
}
