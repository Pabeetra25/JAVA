package np.edu.asc.ioandstreams;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args)throws IOException {

        FileReader fr=new FileReader("Elon.txt");
        FileWriter fw=new FileWriter("Ratna.txt",true);
        int i;
        while ( (i=fr.read()) != -1){
            System.out.print((char) i);
            fw.write(i);
        }
        String hello="\n\nHello World\n";
        fw.write(hello);
        fr.close();//compulsory
        fw.close();//compulsory
    }
}
