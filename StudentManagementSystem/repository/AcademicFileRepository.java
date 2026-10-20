package repository;

import model.Marks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AcademicFileRepository {

    private final Path filePath =
            Paths.get("data", "marks.txt");

    public AcademicFileRepository() {
        try {
            Files.createDirectories(filePath.getParent());

            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to create marks file", e);
        }
    }

    public List<Marks> loadAll() {
        List<Marks> marksList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                if (line.isBlank()) {
                    continue;
                }

                String[] data = line.split("\\|", -1);

                if (data.length != 4) {
                    throw new IOException("Invalid marks record");
                }

                marksList.add(new Marks(
                        Integer.parseInt(data[0]),
                        Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                ));
            }

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(
                    "Unable to load marks", e);
        }

        return marksList;
    }

    public void saveAll(List<Marks> marksList) {
        List<String> lines = new ArrayList<>();

        for (Marks m : marksList) {
            lines.add(
                    m.getStudentId() + "|" +
                    m.getSubject1() + "|" +
                    m.getSubject2() + "|" +
                    m.getSubject3()
            );
        }

        try {
            Files.write(filePath, lines);
        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to save marks", e);
        }
    }
}
