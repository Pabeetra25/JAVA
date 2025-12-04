package np.edu.practical;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseOfThrowsKeyword {
    public static void main(String[] args) {
        try {
            String str = readFromFile();
            System.out.println(str);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public static String readFromFile() throws FileNotFoundException, IOException
    {
        char ch;
        String str = null;
        FileReader fr = new FileReader("abc.txt");
        while((ch = (char)fr.read())!= -1)
        {
            str += ch;
        }
        fr.close();
        return str;
    }
}
