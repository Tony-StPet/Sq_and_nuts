import java.util.List;

// создаем классс белка она берет на вход список созданных орехов и что-то делает
public class Squirrel {

    public static void getMoreNuts(List<Nut> nuts ){
        double sum = 0.0;
        for (Nut nut : nuts) {
            System.out.println("Еще орешек");
            sum += nut.weight;
        }
        System.out.println("Вес орехов= " + sum);
    }
}
