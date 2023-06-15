package homeworks.homework_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static Path basePath = Paths.get("src/main/resources/homework_8");

    public static void main(String[] args) {

//        deleteFileFolder(basePath);
        createFolders();
//        printPathTreeAndFileContent(basePath);
    }

    private static void createFolders() {

        int folderNumber = 8;
//        int folderDepth = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 1; i <= folderNumber; i++) {
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
        if (path.toFile().isDirectory()) {
            File[] files = path.toFile().listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFileFolder(file.toPath());
                }
            }
        }
        if (!path.toFile().delete()) {
            System.out.println("Deleting error: " + path.toFile().getAbsolutePath());
        }
    }

    private static void printPathTreeAndFileContentIo(Path folderPath) {
        // using java io
        File element = new File(folderPath.toString());
        File[] paths = element.listFiles();

        for (File path : paths) {
            if (path.isDirectory()) {
                printPathTreeAndFileContentIo(path.toPath());
            } else {
                System.out.printf("File path: '%s'\nFile '%s' content:\n%s\n\n", path, path.getName(),
                        getFileContent(path.toPath()));
            }
        }
    }

    private static void printPathTreeAndFileContentNio(Path folderPath) throws IOException {
        // using java nio
        Files.walk(folderPath)
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
    }

    private static String getFileContent(Path path) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Reading file error: " + path + " - " + e.getMessage());
        }
        return content.toString();
    }

}
