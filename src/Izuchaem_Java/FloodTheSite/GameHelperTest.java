package Izuchaem_Java.FloodTheSite;

import java.util.ArrayList;

public class GameHelperTest {
    static void main(String[] args) {

        ArrayList<DotCom> dotComList = new ArrayList<>();
        DotCom site1 = new DotCom();
        DotCom site2 = new DotCom();
        DotCom site3 = new DotCom();
        site1.setName("Pets.com");
        site2.setName("Go2.com");
        site3.setName("Toys.com");
        dotComList.add(site1);
        dotComList.add(site2);
        dotComList.add(site3);
        GameHelper helper = new GameHelper();
        for (DotCom dotCom : dotComList) {
            System.out.println(helper.plaseDotCom(3));
        }
    }
}
