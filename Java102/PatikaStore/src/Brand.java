public class Brand {
    private int id;
    private int nextId = 0;
    private String name;

    public Brand(String name) {
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
