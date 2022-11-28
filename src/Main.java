
import ammunitions.*;
import motorcyclist.*;

public class Main {
    public static void main(String[] args) {

        Ammunition[] ammunition = new Ammunition[]{new Jacket(70, 1800, Producer.Abibas),
                new Trousers(60, 700, Producer.Ruma), new Shoes(80, 2100, Producer.Ruma),
                new Helmet(80, 1500, Producer.Neke)};
        Motorcyclist jackson = new Motorcyclist(ammunition, "Jackson");
        jackson.sort();
        System.out.println(jackson);


    }
}
