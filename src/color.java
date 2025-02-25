public class color extends car {
    String  size;
    String color;
    public color(String size, String color){
        // the constructor of the parent class
         super(size);
         this.size = size;
         this.color = color;
    }
    public void shape(){
        // calling size shape methods from the car class
        super.size();
        System.out.println("size:"+size +" color:"+color);
    }
}
