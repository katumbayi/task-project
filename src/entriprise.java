public class entriprise {

    public String name;
    int account;
    private  double remuration;
    String department;

    public entriprise(String name, int account, String department,double remuration) {
        this.name = name;
        this.account = account;
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
        System.out.println("exaucee: " + name);
        System.out.println("account: " + account);
        System.out.println("department: " + department);
        displayRemuration();
    }
}
