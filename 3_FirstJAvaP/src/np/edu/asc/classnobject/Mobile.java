package np.edu.asc.classnobject;

public class Mobile {
    int ram;
    int battery;
    String version;
    float cameraPixels;
    boolean isWifi=true;
    public void call(){
        System.out.println("tring tring");
    }
    public void takePic(){
        System.out.println("click");
    }
    public void playRaceGame(){
        System.out.println("zoom");
    }
    public  void call(int ringTime){//argument
        System.out.println("tring tring"+ringTime);
    }

    public static void main(String[] args) {
        Mobile samsung=new Mobile();
        samsung.ram=4;
        samsung.battery=4000;
        samsung.version="2.01E";
        samsung.cameraPixels=16.4f;
        samsung.call(10);//parameter
        samsung.takePic();
        samsung.playRaceGame();
        System.out.println("specs of mobile");
        System.out.println("Ram: "+samsung.ram);
        System.out.println("Battery: "+samsung.battery);
        System.out.println("Version: "+samsung.version);
        System.out.println("CameraPixels: "+samsung.cameraPixels);
        System.out.println("Wifi present: "+samsung.isWifi);


        Mobile nokia=new Mobile();
        nokia.ram=0;
        nokia.battery=10000000;
        nokia.version="3310";
        nokia.cameraPixels=0.0f;
        nokia.isWifi=false;
        System.out.println("nokia specs");
        System.out.println("Ram: "+nokia.ram);
        System.out.println("Battery: "+nokia.battery);
        System.out.println("Version: "+nokia.version);
        System.out.println("CameraPixels: "+nokia.cameraPixels);
        System.out.println("Wifi present: "+nokia.isWifi);

    }

}
