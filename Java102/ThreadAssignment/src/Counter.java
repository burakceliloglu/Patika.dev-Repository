import java.util.ArrayList;

public class Counter implements Runnable{
    public static ArrayList<Integer> evens = new ArrayList<>();
    public static ArrayList<Integer> odds = new ArrayList<>();

    public static ArrayList<Integer> thread1 = new ArrayList<>();
    public static ArrayList<Integer> thread2 = new ArrayList<>();
    public static ArrayList<Integer> thread3 = new ArrayList<>();
    public static ArrayList<Integer> thread4 = new ArrayList<>();

    ArrayList<Integer> numbers = new ArrayList<>();
    {
        for(int i=1; i<=10000; i++){
            numbers.add(i);
        }
        for(int i=1; i<=numbers.size(); i++){
            if(i<=numbers.size()/4){
                thread1.add(i);
            }
            else if(i<=numbers.size()/2){
                thread2.add(i);
            }
            else if(i<=numbers.size()*3/4){
                thread3.add(i);
            }
            else{
                thread4.add(i);
            }
        }
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Thread-0")){
            for(Integer number : thread1){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-1")){
            for(Integer number : thread2){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-2")){
            for(Integer number : thread3){
                add(number);
            }
        }
        if(Thread.currentThread().getName().equals("Thread-3")){
            for(Integer number : thread4){
                add(number);
            }
        }
    }

    synchronized void add(int number){
        if(number%2==0){
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            evens.add(number);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            odds.add(number);
        }
    }
}
