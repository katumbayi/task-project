public class unix {
    private static int frank = 30 ;
    private int plame;
    private String lamar;

    {

       plame= frank++;
    }
    public unix(String lamar){

        this.lamar = lamar;
    }
    public unix(int plame){
        this.plame = plame;
    }

    public int getPlame(){

        return plame;
    }
    public String getLamar(){

        return lamar;
    }
    public void result(){
        System.out.println("the name is "+lamar);
        System.out.println("the age is"+plame);
    }

}

