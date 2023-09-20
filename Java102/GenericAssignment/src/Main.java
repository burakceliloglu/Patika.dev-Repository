public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Status of list: " +
                ((list.isEmpty()) ? "Empty" : "Filled"));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("Status of list: " +
                ((list.isEmpty()) ? "Empty" : "Filled"));

        //Set
        list.set(0, 100);

        //Remove
        list.remove(2);

        //Get
        System.out.println(list.get(2));

        // First Index
        System.out.println("Index(20): " + list.indexOf(20));

        // returns -1 (before set)
        System.out.println("Index(100): " + list.indexOf(100));

        //last index
        System.out.println("Last index(20): " + list.lastIndexOf(20));

        // To Array
        Object[] array = list.toArray();
        System.out.println("The first element of list:" + array[0]);

        // Sublist
        MyList<Integer> subList = list.subList(0, 5);
        System.out.println(subList.toString());

        // Contains
        System.out.println("20: " + list.contains(20));
        System.out.println("120: " + list.contains(120));

        // clear the list
        list.clear();
        System.out.println(list.toString());

    }
}