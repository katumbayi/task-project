public class HospitalService implements Service {
    String department;
    int id;

    public HospitalService(String department, int id) {
        this.department = department;
        this.id = id;
    }

    public String Service(String source) {
        return "HospitalService";
    }


    @Override
    public String Hospital(String source) {
        return "";
    }
}