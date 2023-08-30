public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int oralExam1, int oralExam2, int oralExam3){
        if(note1>=0 && note1<=100 && oralExam1>=0 && oralExam1<=100) {
            c1.note = (int) ((note1 * 0.8) + (oralExam1 * 0.2));
        }
        if(note2>=0 && note2<=100 && oralExam2>=0 && oralExam2<=100) {
            c2.note = (int) ((note2 * 0.8) + (oralExam2 * 0.2));
        }
        if(note3>=0 && note3<=100 && oralExam3>=0 && oralExam3<=100) {
            c3.note = (int) ((note3 * 0.8) + (oralExam3 * 0.2));
        }
    }

    double calculateAverage(){
        average = (double) (this.c1.note + this.c2.note + this.c3.note) / 3;
        return average;
    }

    void isPass(){
        if(calculateAverage()>55){
            System.out.println("You passed the class.");
            this.isPass = true;
        }
        else{
            System.out.println("You didn't pass the class.");
        }
    }

    void printNote(){
        System.out.println(this.c1.name + " Not:" + this.c1.note);
        System.out.println(this.c2.name + " Not:" + this.c2.note);
        System.out.println(this.c3.name + " Not:" + this.c3.note);
    }
}
