public abstract class projectwork {
    //common attribute
    public String name;
    public int number;
    public int id;

    //constructor to initialize common attribute
    public projectwork(String name,int number,int id){
        this.name=name;
        this.number=number;
        this.id=id;

        //Abstract method to display details
        public abstract void displayDetails();

        //compute the value
        public int computerValue(int parameter){
            
        }
    }
}
