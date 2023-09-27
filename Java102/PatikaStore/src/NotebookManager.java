import java.util.ArrayList;

public class NotebookManager {
    private ArrayList<Notebook> notebooks = new ArrayList<>();

    public void run(){
        createNotebooks();
        showNotebooks();
    }

    public void createNotebooks(){
        notebooks.add(new Notebook("HUAWEI Matebook 14",7000,"Huawei",512,14.0,16));
        notebooks.add(new Notebook("LENOVO V14 IGL",3699,"Lenovo",1024,14.0,8));
        notebooks.add(new Notebook("ASUS Tuf Gaming",8199,"Asus",2048,15.6,32));
    }

    public void showNotebooks(){
        String name = "Name";
        String price = "Price";
        String brand = "Brand";
        String storage = "Storage (GB)";
        String screen = "Screen";
        String ram = "RAM (GB)";

        System.out.printf("\n\nList of Notebooks\n\n" +
                "------------------------------------------" +
                "------------------------------------------------\n" +
                "| ID | %-20s | %-8s | %-8s | %-14s | %-8s | %-8s |\n--------" +
                "---------------------------" +
                "-------------------------------------------------------\n",
                name,price,brand,storage,screen,ram);
        for(Notebook notebook : notebooks){
            System.out.printf("| %-2d | %-20s | %-8d | %-8s | %-14d | %-8.1f | %-8d |\n",notebook.getId(),notebook.getFullName(),notebook.getPrice(),notebook.getBrandName(),notebook.getStorage(),notebook.getScreen(),notebook.getRam());
        }
        System.out.println("----------------------------------------" +
                "--------------------------------------------------");
    }
}
