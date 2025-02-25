public class color extends car {
    private double red;
    public color(String size, double color){
        // the constructor of the parent class
         super(size);
         this.red = color;
    }
    public void shape(){
        // calling size shape methods from the car class
        super.size();
        System.out.println("The color is " + red);
    }
}
