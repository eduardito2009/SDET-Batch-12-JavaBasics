package syntax.class25;

public abstract class SmartWatch {
    //We can have instance variables in an abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;
    SmartWatch(int RAM, int ROM, double displaySize, String make){
        this.RAM=RAM;//Use this Keyword to distinguish from instance and local variables
        this.ROM=ROM;
        this.displaySize=displaySize;
        this.make=make;
    }
    //1) access modifiers
    //2) non-access modifiers
    //3)return type
    //4) method name
    public abstract void showHealthTips();
    public void updateOS(){
        checkOSUpdate();
        System.out.println("Updating the OS");
    }
    private void checkOSUpdate(){
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update");
    }
    private void installUpdate(){
        System.out.println("installing the update");
    }
    static void displayTime(){
        System.out.println("Displaying time");
    }
}

class AppleWatch extends SmartWatch{

    AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    @Override
    public void showHealthTips() {

    }
}
