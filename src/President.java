public class President extends PrimeMinister{
    String country;

    public President(String name, String department, String country,int age,int term) {
        super(name, department, age, term);
        this.country = country;
    }
    public void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}
