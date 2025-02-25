public class generationBeta {
    public static void main(String[] args) {
        generationZ gen = new generationZ();
        generationAlpha beta = new generationAlpha();

        //Overriding Method
        gen.information();
        beta.information();

        //Overloading Method
        gen.printinfo();
        beta.printinfo();

    }
}
