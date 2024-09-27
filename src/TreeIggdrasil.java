import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TreeIggdrasil {


    public static List<Nut> createMassNuts(int size){
        List<Nut> massNuts = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            massNuts.add(new Nut());
        }
      return massNuts;
    }
}
