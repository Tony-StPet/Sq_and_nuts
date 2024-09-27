import java.util.Random;

public class Nut {
    double weight = 12.5;

    public Nut() {
        Random random = new Random();
        this.weight = (random.nextInt(81)+100/10.0);
    }

    @Override
    public String toString() {
        return "Nut{" + weight + '}';
    }

}
