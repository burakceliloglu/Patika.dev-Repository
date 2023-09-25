public class Device {
    private int price;
    private String brandName;
    private int storage;
    private int screen;
    private int ram;

    public Device(int price, String brandName, int storage, int screen, int ram) {
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

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
