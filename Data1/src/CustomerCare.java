public class CustomerCare {
   private final String service;

   public CustomerCare(String service){
       this.service = service;
   }
   public void processInformation(){
        String information = service;
        System.out.println("information:"+ information);
   }
}
