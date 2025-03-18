public abstract class projectwork {
    //common attribute
    protected String name;
    protected int number;

    //constructor to initialize common attribute
    public projectwork(String name,int number) {
        this.name = name;
        this.number = number;
    }
        //Abstract method to display details
        public abstract void displayDetails();

        //concrete method to computer value
        public int objec(int parameter){
            return number*parameter;
        }

}
