import java.util.Random;

public interface RandomInterface {

    default int __(int max) {
        return getRandom(1, max + 1);
    }

    default int getNumberStrikes() {
       return getRandom(0, 4);
    }

    private int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
