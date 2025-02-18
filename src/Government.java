public class Government {
    public static void main(String[] args) {

        PrimeMinister Gn = new PrimeMinister("Richard","Head of The Government",63,1);
        President pdt = new President("Felix","Head of State","DR Congo",67,2);

        Gn.display();
        System.out.println();
        pdt.display();
    }
}
