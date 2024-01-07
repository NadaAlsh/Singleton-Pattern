public class IphoneSettings {
    private static IphoneSettings instance;
    private int brightness;
    private boolean isWifiEnabled;

    public static IphoneSettings getInstance(){
        if (instance == null){
            instance = new IphoneSettings();
        }
        return instance;
    }
    
    public void setBrightness(int myBrightness){
        this.brightness = myBrightness;
    }

    public int getBrightness(){
        return brightness;
    }

    public void setIsWifiEnabled(boolean myWifi){
        this.isWifiEnabled = myWifi;
    }

    public void setEnable(){
        this.isWifiEnabled = true;
    }
    public void setDisable(){
        this.isWifiEnabled = false;
    }
     
 public boolean getIsWifiEnabled(){
        return isWifiEnabled;
    }
    

}
