public class CustomerCare {
   private Service service;

   public CustomerCare(Service service){
       this.service = service;
   }
   public void processInformation(){
        String information = service.Hospital("Doctor");
        System.out.println("information:"+ information);
   }
}
