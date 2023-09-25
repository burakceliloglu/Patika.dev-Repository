import java.util.ArrayList;

public class BrandManager {
    private ArrayList<Brand> brandsArrayList = new ArrayList<>();

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

}
