public class offra {
    private static int uni;
    private static int over;
    private String dan;

    static{
        uni = 200;
        System.out.println("Static block executed.uni initialized " + uni);
    }

    public offra(String dan){
        this.dan = dan;

        over++;
    }
    public static int getUni(){
        return uni;
    }
    public static int getOver(){
        return over;
    }
    public String getDan(){
        return dan;
    }
}
