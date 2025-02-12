public class entriprise {

    public String exaucee;
    int amount;
    private double remuration;
    String department;

    public entriprise(String exaucee, int manager, String department, double remuration) {
        this.exaucee = exaucee;
        this.amount = manager;
        this.department = department;
        this.remuration = remuration;

    }
    public double getRemuration() {
        return remuration;
    }
    public void displayRemuration() {
        System.out.println("remuration: " + remuration);
    }
    public void display() {
        System.out.println("exaucee: " + exaucee);
        System.out.println("manager: " + amount);
        System.out.println("department: " + department);
        displayRemuration();
    }
}
