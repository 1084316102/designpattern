public class Main {
    public static void  main(String[] args){
        School school = new School();
        school.setPolicy(new Student());
        school.act();
        System.out.println("#############################");
        school.setPolicy(new Teacher());
        school.act();
//        Student student = new Student();
//        Teacher teacher = new Teacher();

    }
}
