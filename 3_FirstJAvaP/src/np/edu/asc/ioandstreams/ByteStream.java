package np.edu.asc.ioandstreams;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {

            FileInputStream fis = new FileInputStream("Elon.txt");
            FileOutputStream fos = new FileOutputStream("Ratna.txt");
            int i;
            while ( (i=fis.read()) != -1){
                System.out.print((char) i);
                fos.write(i);
        }
            fis.close();
            fos.close();
        }
    }

