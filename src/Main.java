
import ammunitions.Ammunition;
import ammunitions.FirstAidKit;
import ammunitions.LightEquipment;
import ammunitions.ProtectiveeEquipment;
import motorcyclist.Motorcyclist;

public class Main {

    public static void main(String[] args) {
        Ammunition[] ammunition = new Ammunition[]{new FirstAidKit(45, 800,
                new FirstAidKit.MedicalPreparation[]{FirstAidKit.MedicalPreparation.BANDAGES,
                        FirstAidKit.MedicalPreparation.PAINKILLER}),
                new ProtectiveeEquipment(45, 1400, 8, 52, ProtectiveeEquipment.Type.HELMET),
                new LightEquipment(60, 900, 9, 52, LightEquipment.Type.TEXTILEJACKET),
                new ProtectiveeEquipment(100, 1200, 10, 50, ProtectiveeEquipment.Type.PROTECTIVEGLOVES)};
        Motorcyclist jackson = new Motorcyclist(ammunition, "Jackson");
        System.out.println(jackson.toString());
        jackson.sort();
        System.out.println(jackson.toString());

    }

}
