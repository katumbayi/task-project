public class PrimeMinister extends MinisterOfEconomy {
    int term;

    public PrimeMinister( String name, String department, int age, int term) {
        super(name, department, age);
        this.term = term;
    }

    public void display() {
        super.display();
        System.out.println( "Term: " + term + "years old" );
    }
}
