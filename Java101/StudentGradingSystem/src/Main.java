public class Main {
    public static void main(String[] args) {
        Teacher burak = new Teacher("Burak","MTH","555");
        Teacher nefize = new Teacher("Nefize", "HIS", "535");
        Teacher necmi = new Teacher("Necmi","PHY","533");

        Course math = new Course("Math", "101","MTH");
        math.addTeacher(burak);
        Course physics = new Course("Physics","102","PHY");
        physics.addTeacher(necmi);
        Course history = new Course("History","101","HIS");
        history.addTeacher(nefize);

        Student su = new Student("Su","123","4",physics,history,math);
        su.addBulkExamNote(100,50,90,10,90,10);
        su.printNote();
        su.isPass();
    }
}