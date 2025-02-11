public class schoolstudent {
    public static void main(String[] args) {
        school school1 kabowa = new school("3200");
        school school2 = new school("4000");
        school school3 = new school("2027");

        Student student = new Student();

        student.addSchool(school1 kabowa);
        student.addSchool(school2);
        student.addSchool(school3);

        student.displayschools();
        System.out.println("students in the school " + school1 kabowa.getDirect());
    }
}
