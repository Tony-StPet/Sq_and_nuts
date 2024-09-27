import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Nut> nuts2 = TreeIggdrasil.createMassNuts(8);
        System.out.println(nuts2);

        Squirrel.getMoreNuts(nuts2);


    }
}