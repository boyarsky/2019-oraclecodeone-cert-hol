
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OracleCodeOne {

    public static void main(String... args) throws IOException {
        OracleCodeOne codeOne = new OracleCodeOne();
        codeOne.fileProcessing();
    }

    private void fileProcessing() throws IOException {
        Path path = Paths.get("temps.txt");
        Stream<String> stream = Files.lines(path);
        try (stream) {
            stream
                    .mapToDouble(Double::parseDouble)
                    .max()
                    .ifPresent(d -> System.out.println("Max: " + d));
        }

    }
}
