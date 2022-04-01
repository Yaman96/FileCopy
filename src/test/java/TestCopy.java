import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;


public class TestCopy extends TestCase
{

    public void testCopyPath()
    {
        File sourceFile = new File("src/test/resources/testFolder");
        File destFile = new File("src/test/resources/testFolderCopy");
        File innerFolder = new File("src/test/resources/testFolder/innerFolder");
        boolean isCreated = innerFolder.mkdir();
        File file1 = new File("src/test/resources/testFolder/file1.txt");
        File fileInsideInnerFolder = new File("src/test/resources/testFolder/innerFolder/file2.txt");

        try
        {
            boolean isCreated1 = file1.createNewFile();
            boolean isCreated2 = fileInsideInnerFolder.createNewFile();
        }
        catch (IOException | SecurityException e)
        {
            e.printStackTrace();
        }

        Copy.copyPath(sourceFile.getAbsolutePath(),destFile.getAbsolutePath());
        assertTrue(new File("src/test/resources/testFolderCopy/innerFolder").exists() && new File("src/test/resources/testFolderCopy/file1.txt").exists() && new File("src/test/resources/testFolderCopy/innerFolder/file2.txt").exists());
    }
}
