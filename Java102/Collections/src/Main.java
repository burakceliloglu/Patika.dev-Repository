import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HASH SET
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        //LINKED LIST
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();

        lhSet.add(30);
        lhSet.add(10);
        lhSet.add(20);

        Iterator<Integer> itr2 = lhSet.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println();

        //TREE SET
        TreeSet<Integer> trSet = new TreeSet<>();
        trSet.add(100);
        trSet.add(30);
        trSet.add(10);
        trSet.add(20);

        Iterator<Integer> itr3 = trSet.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println();

        // ARRAY LIST
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(20);
        //Add in index (it is not an update)
        arrayList.add(3,5);
        //Update
        arrayList.set(4,55);
        //remove
        arrayList.remove(4);
        //Copy list
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        //Sublist
        System.out.println(arrayList.subList(3,5));

        //Index
        System.out.println(arrayList.get(1));
        //Index of
        System.out.println(arrayList.indexOf(20));
        //Last index of
        System.out.println(arrayList.lastIndexOf(20));
        //Contains
        System.out.println(arrayList.contains(123123));
        //Print arrayList
        System.out.println(arrayList);

        System.out.println();

        //LINKED LIST
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Burak");
        linkedList.add("Samet");
        linkedList.add("Su");
        linkedList.add("Aylin");
        linkedList.offer("Offer");
        // .remove() will delete only first element.
        linkedList.remove("Offer");
        // first element.
        linkedList.element();
        // remove first element and print.
        System.out.println(linkedList.poll());

        System.out.println(linkedList);

        System.out.println();

        //VECTOR
        Vector<String> vector = new Vector<>();
        vector.add("Burak");
        vector.add("Celiloğlu");
        System.out.println(vector);

        System.out.println();

        //PRIORITY QUEUE
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        priorityQueue.add("Burak");
        priorityQueue.add("Necmi");
        priorityQueue.add("Aylin");

        for(String s: priorityQueue){
            System.out.println(s);
        }

        System.out.println();

        //HASH MAP
        HashMap<String, String> hashMap =  new HashMap<>();
        hashMap.put("TR","Turkey");
        hashMap.put("GR","Greece");
        hashMap.put("ES","Spain");
        hashMap.remove("ES");
        System.out.println(hashMap.containsKey("ES"));
        System.out.println(hashMap.containsValue("Spain"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("TR"));

        for(String countryValue : hashMap.values()){
            System.out.println(countryValue);
        }

        for(String countryKey : hashMap.keySet()){
            System.out.println(countryKey);
        }
    }
}