package motorcyclist;

import ammunitions.*;

import java.util.Arrays;

public class Motorcyclist  {

    private Ammunition[] ammunition;
    private String name;

    public Motorcyclist() {


    }

    public Motorcyclist(Jacket jacket, Trousers trousers, Shoes shoes, Helmet helmet, String name) {

        ammunition = new Ammunition[]{jacket, trousers, shoes, helmet};
        this.name=name ;
    }

    public Motorcyclist(Ammunition[] ammunition, String name) {
        this.ammunition = new Ammunition[]{ammunition[0], ammunition[1], ammunition[2], ammunition[3]};
        this.name=name;

    }

    @Override
    public String toString() {
        return "motorcyclist.Motorcyclist " +name +"{\n" + ammunition[0] + ", \n " +
                ammunition[1] + ", \n" +
                ammunition[2] + ", \n" +
                ammunition[3] +
                '}';

    }



     public  void sort()
     {

         Arrays.sort(ammunition, (a, b) -> a.getWeightGrams() < b.getWeightGrams() ? -1 :
                 a.getWeightGrams() == b.getWeightGrams() ? 0 : 1);
     }
}
