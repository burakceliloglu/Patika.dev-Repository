import java.util.ArrayList;
import java.util.Scanner;

public class CellphoneManager {
    private ArrayList<Cellphone> cellphoneArrayList = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void run(){
        this.createCellphone();
        System.out.println("\n\nActions\n----------\n1-List\n2-Add\n3-Delete\n4-Filter");
        System.out.print("Enter the actions: ");
        int selection = scanner.nextInt();
        switch (selection){
            case 1:
                this.showCellphone();
                break;
            case 2:
                this.addCellphone();
                break;
        }

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
                        "----------------------------------------------------" +
                        "------------------------------------------------" +
                        "------------------------------\n" +
                        "| ID | %-23s | %-8s | %-8s | %-14s | %-8s | %-8s | %-8s | %-8s | %-12s |\n--------" +
                        "-------------------------------" +
                        "---------------------------------------------" +
                        "----------------------------------------------\n",
                name,price,brand,storage,screen,camera,battery,ram,color);
        for(Cellphone cellphone : cellphoneArrayList){
            System.out.printf("| %-2d | %-23s | %-8d | %-8s | %-14d | %-8.1f | %-8d | %-8d | %-8d | %-12s |" +
                    "\n",cellphone.getId(),cellphone.getFullName(),cellphone.getPrice(),cellphone.getBrandName(),cellphone.getStorage(),cellphone.getScreen(),cellphone.getCamera(),cellphone.getBattery(),cellphone.getRam(),cellphone.getColor());
        }
        System.out.println("------------------------------------" +
                "------------------------------------------------" +
                "----------------------------------------------");
    }

    public void addCellphone() {

    }
}
