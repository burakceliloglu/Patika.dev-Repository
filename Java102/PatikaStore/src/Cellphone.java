public class Cellphone extends Device{
    private int camera;
    private int battery;
    private String color;
    public Cellphone(String fullName ,int price, String brandName, int storage, double screen,int camera, int battery, int ram, String color) {
        super(fullName, price, brandName, storage, screen,ram);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
