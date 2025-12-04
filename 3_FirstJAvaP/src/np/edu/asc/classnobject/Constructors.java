package np.edu.asc.classnobject;

public class Constructors {
    int ram=3;  int battery;  String version;  float cameraPixels;  boolean isWifi=true;//non-static||instance variable
    static int budget=1000;//global variable
    public void call(){
        System.out.println("tring tring");
    }
    public void takePic(){
        System.out.println("click");
    }
    public void playRaceGame(){
        System.out.println("zoom");
    }
    public Constructors(int ram,int battery,String version,float cameraPixels,boolean isWifi){
       this.ram=ram; this.battery=battery; this.version=version; this.cameraPixels=cameraPixels; this.isWifi=isWifi;
    }

    public static void main(String[] args) {
        Constructors mobile1=new Constructors(1,3000,"test",2,true);
        Constructors.budget=Constructors.budget-200;
        System.out.println("budget remaining:"+Constructors.budget);
        Constructors mobile2=new Constructors(2,3000,"test",2,false);
        Constructors.budget=Constructors.budget-200;
        System.out.println("budget remaining:"+Constructors.budget);

        Constructors mobile3=new Constructors(2,3000,"test",2,false);
        Constructors.budget=Constructors.budget-200;
        System.out.println("budget remaining:"+Constructors.budget);
    }
}
