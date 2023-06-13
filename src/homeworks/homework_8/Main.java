package homeworks.homework_8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    static Path basePath = Paths.get("/Users/snikolaiev/hillel/src/homeworks/resources/homework_8");

    public static void main(String[] args) {

        deleteFileFolder(basePath);
//        createFolders();
//        printPathTreeAndFileContent(basePath);
    }

    private static void createFolders() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 1; i <= 8; i++) {
                Path folderPath = basePath.resolve("folder_" + i);
                Files.createDirectories(folderPath);
                if (i % 2 == 0) {
                    Path filePath = folderPath.resolve("file_of_folder_" + i);

                    System.out.printf("Input content of file %s :\n", folderPath);
                    String content = reader.readLine();

                    try (FileWriter writer = new FileWriter(filePath.toString())) {
                        writer.write(content);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to create directory or file!" + e.getMessage());
        }
    }

    private static void deleteFileFolder(Path path) {
        try (Stream<Path> walkStream = Files.walk(path)) {
            walkStream
                    .sorted(java.util.Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(java.io.File::delete);
        } catch (IOException e) {
            System.out.println("Error during deleting: " + e.getMessage());
        }
    }

    private static void printPathTreeAndFileContent(Path path) {

    }

}
