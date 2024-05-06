package np.edu.asc.classnobject;

public class Assembly {
    public static void main(String[] args) {
        Mobile samsung=new Mobile();
        samsung.ram=4;
        samsung.battery=4000;
        samsung.version="2.01E";
        samsung.cameraPixels=16.4f;
        samsung.call();
        samsung.takePic();
        samsung.playRaceGame();
        System.out.println("specs of mobile");
        System.out.println("Ram: "+samsung.ram);
        System.out.println("Battery: "+samsung.battery);
        System.out.println("Version: "+samsung.version);
        System.out.println("CameraPixels: "+samsung.cameraPixels);
        System.out.println("Wifi present: "+samsung.isWifi);

    }

}
