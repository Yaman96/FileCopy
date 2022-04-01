import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)  {
        System.out.println("\t--The program is running--\n");
        System.out.print("Enter the path to the folder you want to copy: ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        try {
            String sourcePath = userInput.readLine();
            System.out.print("\nEnter the path to the folder you want to insert: ");
            String destPath = userInput.readLine();
            Copy.copyPath(sourcePath, destPath);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
