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
    private static final Path BASE_PATH = Paths.get("src/main/resources/homework_8");

    public static void main(String[] args) {

        deleteFileFolder(BASE_PATH);
        createFolders();
        printFilesPathAndContent(BASE_PATH);
    }

    private static void createFolders() {

        int folderNumber = 8;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 1; i <= folderNumber; i++) {
                Path folderPath = BASE_PATH.resolve("folder_" + i);
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

    private static void printFilesPathAndContent(Path folderPath) {
        try {
            Files.walk(folderPath)
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        System.out.printf("File path:\n%s\n", file);
                        System.out.printf("File content:\n%s\n\n", getFileContent(file));
                    });
        } catch (IOException e) {
            System.err.println("Error traversing directory: " + folderPath + " - " + e.getMessage());
        }
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
