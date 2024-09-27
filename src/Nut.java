import java.util.Random;
// создание класса орех, у которого вес создается в диапазоне 10-18
public class Nut {
    double weight = 12.5;

    public Nut() {
        Random random = new Random();
        this.weight = ((random.nextInt(81)+100)/10.0);
    }
// метод вывода toString
    @Override
    public String toString() {
        return "Nut{" + weight + '}';
    }

}
