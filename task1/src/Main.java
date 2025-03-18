public class Main {
    public static void main(String[] args) {
        //Creating an instance of subclasses
        projectwork cd = new team("IT protection" ,50,324);
        projectwork cd1 = new product("Networking", 60, 100);

        //Displaying details
        cd.displayDetails();
        cd1.displayDetails();

    }
}