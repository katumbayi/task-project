public class product extends projectwork {
    private int members;

    public product(String name, int number, int members){
        super(name,number);
        this.members=members;
    }
    public void displayDetails(){
        System.out.println("Product Name:" + name + "Number:" + number + "Members:" + members);
    }
}
