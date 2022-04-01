import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    //Возвращает true если папка найдена
    public static void copyPath(String sourcePath, String destPath) {
        File sourceFolder = new File(sourcePath);
        File destFolder = new File(destPath);

        try
        {
            FileUtils.copyDirectory(sourceFolder, destFolder);
        }
        catch (NullPointerException | IOException e)
        {
            System.out.println("Ошибка! Указан путь не к папке а к файлу.");
            e.printStackTrace();
        }
    }
}
