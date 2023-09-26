import java.util.ArrayList;

public class BrandManager {
    private ArrayList<Brand> brandsArrayList = new ArrayList<>();

    public void run(){
        this.createBrands();
        this.showBrands();
    }

    public void createBrands(){
        brandsArrayList.add(new Brand("Samsung"));
        brandsArrayList.add(new Brand("Lenovo"));
        brandsArrayList.add(new Brand("Apple"));
        brandsArrayList.add(new Brand("Huawei"));
        brandsArrayList.add(new Brand("Casper"));
        brandsArrayList.add(new Brand("Asus"));
        brandsArrayList.add(new Brand("HP"));
        brandsArrayList.add(new Brand("Xiaomi"));
        brandsArrayList.add(new Brand("Monster"));
    }

    public void showBrands(){
        System.out.println();
        System.out.println("\nOur Brands\n-----------------");
        for(Brand brand : brandsArrayList){
            System.out.println(brand.getName());
        }
    }
}
