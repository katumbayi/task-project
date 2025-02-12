public class enterpriseaccess {
    public static void main(String[] args) {
        entriprise company = new entriprise("exaucee",2132,"computer sale",220000);
        System.out.println("Enterprise:"+company.name);
        System.out.println("account:"+company.account);
        System.out.println("remuration:"+company.getRemuration());
        System.out.println("department:"+company.department);

        company.display();

    }
}
