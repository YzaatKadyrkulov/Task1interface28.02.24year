import java.util.stream.BaseStream;

public class Bread implements Baked {
    @Override
    public void bun() {
        System.out.println("Bread is baking...");
    }
}
