public class MyList <T> {
    T[] list;
    int size=0;
    int capacity;

    public MyList() {
        this.capacity = 10;
        this.setList();
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.setList();
    }

    public void setList() {
        this.list = (T[]) new Object[this.capacity];
    }

    public int size() {
        return this.size;
    }

    public void add(T data){
        if(this.capacity>this.size()){
            list[this.size] = data;
            this.sizeCalculate();
        } else{
            this.capacity *= 2;
            this.updateCapacity(this.capacity);
            this.add(data);
        }
    }

    public void sizeCalculate() {
        int x = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                x++;
            }
        }
        this.size = x;
    }

    private void updateCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T get(int index){
        if (index < this.size) {
            return list[index];
        }
        return null;
    }

    public void remove(int index) {
        T[] listTemp2 = this.list;
        this.list[index] = null;
        for (int i = 0; i < listTemp2.length - 1; i++) {
            if (index != 0 && i < index) {
                this.list[i] = listTemp2[i];
            } else if (index != 0 && i >= index) {
                this.list[i] = listTemp2[i + 1];
            }
        }
    }

    public void set(int index, T data) {
        if (index < this.size) {
            list[index] = data;
            System.out.println("Set.");
        } else {
            System.out.println("Invalid Index!");
        }
    }

    public String toString(){
        System.out.print("[");
        for (T i : list) {
            if (i != null) {
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public int indexOf(T data){
        for(int i=0; i<list.length; i++){
            if(list[i]==data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        if(!isEmpty()){
            int i=0;
            int temp = 0;
            for(;i<list.length; i++){
                if(list[i] == data){
                    temp = i;
                }
            }
            return temp;
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }

    public Object[] toArray(){
        Object[] temp = new Object[list.length];
        for (int i = 0; i < list.length; i++) {
            temp[i] = this.list[i];
        }
        return temp;
    }

    public void clear(){
        for(int i=0; i< list.length; i++){
            list[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> array = new MyList<>(finish - start + 1);
        for(int i=start; i<=finish; i++){
            array.add((T) this.list[i]);
        }
        return array;
    }

    public boolean contains(T data){
        for(int i=0; i< list.length; i++){
            if(list[i] == data){
                return true;
            }
        }
        return false;
    }
}