import java.util.ArrayList;
import java.util.List;
// создаем класс дерево у которого есть метод создания списка орехов (а класс орех определяет рандомный вес )
// createMassNuts возвращает списов орехов с определением веса каждого
public class TreeIggdrasil {

    public static List<Nut> createMassNuts(int size){
        List<Nut> massNuts = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            massNuts.add(new Nut());
        }
      return massNuts;
    }
}
