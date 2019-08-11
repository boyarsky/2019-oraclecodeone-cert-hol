
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OracleCodeOneWithVar {

    public static void main(String... args) throws IOException {
        var codeOne = new OracleCodeOneWithVar();
        codeOne.fileProcessing();
    }

    private void fileProcessing() throws IOException {
        var path = Paths.get("temps.txt");
        var stream = Files.lines(path);
        try (stream) {
            stream
                    .mapToDouble(Double::parseDouble)
                    .max()
                    .ifPresent(d -> System.out.println("Max: " + d));
        }

    }
}
