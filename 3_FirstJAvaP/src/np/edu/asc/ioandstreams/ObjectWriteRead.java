package np.edu.asc.ioandstreams;

import java.io.*;

public class ObjectWriteRead {
    public static void main(String[] args)throws IOException,
            ClassNotFoundException {
        System.out.println("Writing of object");
        player p1=new player(1,"Ram",7);
        FileOutputStream fos=new FileOutputStream("score.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.close();fos.close();


        //for deserialization
        System.out.println("Reading object from file");
        FileInputStream fis=new FileInputStream("score.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        player scoreFromFile=(player) ois.readObject();
        System.out.println("the score of the player is:");
        System.out.println(scoreFromFile.id);
        System.out.println(scoreFromFile.name);
        System.out.println(scoreFromFile.score);

    }
}
class player implements Serializable {
    int id;
    String name;
    int score;
    public player(int id,String name,int score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
}
