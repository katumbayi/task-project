public class car {
    private String model;
    public car(String shape){
        this.model = shape;
    }

    public String getModel() {
        return model;
    }
    public final void shape(){
        System.out.println("This is the new model");
    }
}
