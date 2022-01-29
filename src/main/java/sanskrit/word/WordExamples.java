package sanskrit.word;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import java.util.stream.Stream;

import sanskrit.word.enums.KarakTypes;
import sanskrit.word.enums.LakarTypes;
import sanskrit.word.enums.LingTypes;
import sanskrit.word.enums.PurushTypes;
import sanskrit.word.enums.VachanTypes;

public class WordExamples {
    VerbWord v = new VerbWord("", LakarTypes.LAT, null, null);
    NounWords n;

    public static void main(String[] args) throws IOException {
        File f = new File("out.json");
        if (!f.exists()) {
            boolean createNewFile = f.createNewFile();
            if (!createNewFile) {
                throw new RuntimeException("exception");
            }
        }
        try (FileWriter writer = new FileWriter(f, StandardCharsets.UTF_8,
                true)) {
            printAndWriteToFileArray(writer, "\nLakar", LakarTypes.values());
            printAndWriteToFileArray(writer, "\nVachan", VachanTypes.values());
            printAndWriteToFileArray(writer, "\nPURUSH", PurushTypes.values());
            printAndWriteToFileArray(writer, "\nLING", LingTypes.values());
            printAndWriteToFileArray(writer, "\nKARAK", KarakTypes.values());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printAndWriteToFileArray(FileWriter writer,
            String header, Object[] values) {
        printAndWriteToFile(writer).accept(header);
        Stream.of(values).forEach(printAndWriteToFile(writer));
    }

    private static Consumer<? super Object> printAndWriteToFile(
            FileWriter writer) {
        return a -> {
            System.err.println(a);
            try {
                writer.write("\n"+a.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }
}
