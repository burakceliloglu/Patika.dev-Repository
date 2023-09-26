public class Device {
    private String fullName;
    private int price;
    private String brandName;
    private int storage;
    private double screen;
    private int ram;

    public Device(String fullName, int price, String brandName, int storage, double screen, int ram) {
        this.fullName = fullName;
        this.price = price;
        this.brandName = brandName;
        this.storage = storage;
        this.screen = screen;
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
