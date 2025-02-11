public class Main {
        public static void main(String[] args) {
            unix instance = new unix("instance 1");
            unix instance2 = new unix("instance 2");
            unix instance3 = new unix("instance 3");

            System.out.println("Instance 1:" + instance.getPlame() + "lamar" + instance.getLamar());
        }
    }