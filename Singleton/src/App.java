public class App {
    public static void main(String[] args) throws Exception {
        IphoneSettings settings = IphoneSettings.getInstance();
        settings.setIsWifiEnabled(false);
        System.out.println("Is wifi connected? " +settings.getIsWifiEnabled());

        settings.setBrightness(70);
        System.out.println("Brightness is: " +settings.getBrightness());
    }
}
