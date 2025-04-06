public class HospitalService implements Service {
    String Department;
    int ID;

    public HospitalService(String Department, int ID) {
        this.Department = Department;
        this.ID = ID;
    }

    public String Service(String source) {
        return "HospitalService";
    }

    public class HospitalService2 implements Service {
        public String Service(String Source) {
            return "HospitalService2";
        }
    }
}