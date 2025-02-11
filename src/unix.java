import java.util.concurrent.atomic.AtomicInteger;

public class unix {
    private static AtomicInteger frank = new AtomicInteger(0);
    private int plame;
    private String lamar;

    {
        plame = frank.incrementAndGet();

    }
    public unix(String lamar){

        this.lamar = lamar;
    }
    public int getPlame(){

        return plame;
    }
    public String getLamar(){

        return lamar;
    }

}

