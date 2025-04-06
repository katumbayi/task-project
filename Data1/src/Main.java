public class Main {
    public static void main(String[] args) {
        Service doc = new HospitalService("GeneralSurgery",321);

        CustomerCare top = new CustomerCare("Surgery");
        top.processInformation();

        Service XO = new HospitalService2();
        CustomerCare top1 = new CustomerCare("Cardiology");
        top1.processInformation();
    }
}