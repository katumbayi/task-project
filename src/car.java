public class car {
    private String toyota;
    public car(String size){
        this.toyota = size;
    }

    public String getModel() {
        return toyota;
    }
    public final void size(){
        System.out.println("This is the new model"+toyota);
    }
}
