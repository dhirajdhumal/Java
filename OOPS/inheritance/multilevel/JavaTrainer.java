package inheritance.multilevel;

public class JavaTrainer extends Trainer{
    String project;
    JavaTrainer(int trainerId, String subject, String name, int age, String address, String project){
        super(trainerId, subject, name, age, address);
        this.project = project;
        showJavaTrainerrData();
    }

//    void setJavaTrainerData(String project, int trainerId, String subject, String name, int age, String address){
//        this.project = project;
//        super.setTrainerData(trainerId, subject, name, age, address);
//
//    }

    void showJavaTrainerrData(){
        showTrainerData();
        System.out.println("Project: " + project);
    }
    public static void main(String[] args) {

        JavaTrainer j = new JavaTrainer(6, "Java", "Java", 21, "Pune", "Java Project");

    }
}
