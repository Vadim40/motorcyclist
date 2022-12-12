package motorcyclist;

import ammunitions.*;

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
