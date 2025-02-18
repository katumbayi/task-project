public class MinisterOfEconomy extends governmentworkers {
    String department ;

    public MinisterOfEconomy( String name , String department, int age ) {
        super( name , age );
        this.department = department;
    }
    public void display() {
        super.display();
        System.out.println("Department : " + department );
    }
}
