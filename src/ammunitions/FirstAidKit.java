package ammunitions;

import java.util.Arrays;

public class FirstAidKit extends Ammunition{

    String[]  content;
    public FirstAidKit(int priceEuro, int weightGrams, String[] content) {
        super(priceEuro, weightGrams);
        this.content = content;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FirstAidKit{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
