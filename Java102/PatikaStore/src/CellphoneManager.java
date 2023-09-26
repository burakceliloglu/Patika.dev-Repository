import java.util.ArrayList;

public class CellphoneManager {
    private ArrayList<Cellphone> cellphoneArrayList = new ArrayList<>();

    public void run(){
        this.createCellphone();
        this.showCellphone();
    }

    public void createCellphone(){
        cellphoneArrayList.add(new Cellphone("SAMSUNG GALAXY A51",3199,"Samsung",128,6.5,32,4000,6,"Black"));
        cellphoneArrayList.add(new Cellphone("iPhone 11 64GB",7379,"Apple",64,6.1,5,3046,6,"Blue"));
        cellphoneArrayList.add(new Cellphone("Redmi Note 10 Pro 8GB",4012,"Xiaomi",128,6.5,35,4000,12,"White"));
    }

    public void showCellphone(){
        String name = "Name";
        String price = "Price";
        String brand = "Brand";
        String storage = "Storage (GB)";
        String screen = "Screen";
        String camera = "Camera";
        String battery = "Battery";
        String ram = "RAM (GB)";
        String color = "Color";

        System.out.printf("\n\nList of Notebooks\n\n" +
                        "------------------------------------------" +
                        "------------------------------------------------\n" +
                        "| ID | %-20s | %-8s | %-8s | %-14s | %-8s | %-8s |\n--------" +
                        "---------------------------" +
                        "-------------------------------------------------------\n",
                name,price,brand,storage,screen,ram);
        int index = 1;
        for(Cellphone cellphone : cellphoneArrayList){
            System.out.printf("| %-2d | %-20s | %-8d | %-8s | %-14d | %-8.1f | %-8d |\n",index++,cellphone.getFullName(),cellphone.getPrice(),cellphone.getBrandName(),cellphone.getStorage(),cellphone.getScreen(),cellphone.getRam());
        }
        System.out.println("----------------------------------------" +
                "--------------------------------------------------");
    }
}
