import java.util.ArrayList;
import java.util.List;
public class school{
    private String Direct;

    public school(String direct){
        this.Direct = direct;
    }
    public String getDirect(){
        return Direct;
    }
}
    class Student{
    private List<school>schools;

    public Student(){
        schools = new ArrayList<>();
    }
    public void addSchool(school s){
        schools.add(s);
    }
    public void displayschools(){
        System.out.println("School List:");
        for(school s: schools){
            System.out.println("number of schools in the distrist");
        }
    }
    }


