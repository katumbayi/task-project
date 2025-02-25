public class car {
    private String size;
    public car(String size){
        this.size= size;
    }

    public String getModel() {
        return size;
    }
    public final void size(){
        System.out.println("This is the new model Toyota");
    }
}
