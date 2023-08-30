public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int oralExam;
    double effect;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int oralExam =0;
        double effect = 1;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else{
            System.out.println("Doesn't match!");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }


}
