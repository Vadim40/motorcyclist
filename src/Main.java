
import ammunitions.*;
import motorcyclist.*;

public class Main {

    public static void main(String[] args) {
        MedicalPreparations[] cont = new MedicalPreparations[]{MedicalPreparations.PAINKILLER, MedicalPreparations.BANDAGES};
        Ammunition[] a = new Ammunition[]{new FirstAidKit(45, 800, cont),
                new ProtectiveeEquipment(45, 1400, 8, 52,
                        ProtectiveeEquipmenTypes.HELMET),new LightEquipment(60,900,9
        ,52,LightEquipmentTypes.TEXTILEJACKET),new ProtectiveeEquipment(100,1200,10,50,
                ProtectiveeEquipmenTypes.PROTECTIVEGLOVES)};
        Motorcyclist j = new Motorcyclist(a, "Jackson");
        System.out.println(j.toString());
        j.sort();
        System.out.println(j.toString());

    }

}
