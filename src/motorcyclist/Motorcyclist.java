package motorcyclist;

import ammunitions.Ammunition;

import java.util.Arrays;

public class Motorcyclist  {

    private Ammunition[] ammunition;
    private String name;

    public Motorcyclist() {


    }


    public Motorcyclist(Ammunition[] ammunition, String name) {
        this.ammunition = ammunition;
        this.name = name;
    }

    public Ammunition[] getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(Ammunition[] ammunition) {
        this.ammunition = ammunition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Motorcyclist{" +
                "ammunition=" + Arrays.toString(ammunition) +
                ", name='" + name + '\'' +
                '}';
    }

    public  void sort()
     {

         Arrays.sort(ammunition, (a, b) -> a.getWeightGrams() < b.getWeightGrams() ? -1 :
                 a.getWeightGrams() == b.getWeightGrams() ? 0 : 1);
     }
}
