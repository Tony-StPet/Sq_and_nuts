import java.util.List;


public class Main {
    public static void main(String[] args) {

        // создаем новый список орехов
        List<Nut> nuts2 = TreeIggdrasil.createMassNuts(8);
        // выводим новый список орехов
        System.out.println(nuts2);
        // вызываем белку, которая делает свою функцию (подсчет)
        Squirrel.getMoreNuts(nuts2);


    }
}