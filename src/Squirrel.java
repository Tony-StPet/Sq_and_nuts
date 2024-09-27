import java.util.List;

public class Squirrel {

    public static void getMoreNuts(List<Nut> nuts ){
        double sum = 0.0;
        for (Nut nut : nuts) {
            System.out.println("Еще орешек");
            sum += nut.weight;
        }
        System.out.println("Вес орехов" + sum);
    }
}
