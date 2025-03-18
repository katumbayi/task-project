public class team extends projectwork{
    public int id;

    public team(String name, int number,int id ){
     super(name,number);
     this.id=id;
    }
    public void displayDetails(){
        System.out.println("Team Name:"+ name + ",number:" + number +",ID:" + id);

    }
}
