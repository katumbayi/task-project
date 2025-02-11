public class teacher {
    public static void main(String[] args) {
        offra access = new offra("access ");
        offra exe = new offra("exe");
        offra axe = new offra("axe");

        System.out.println("uni:" + offra.getUni());
        System.out.println("over:" + offra.getOver());
        System.out.println("dan:" + access.getDan());
        System.out.println("dan 1:" + exe.getDan());
        System.out.println("dan 2:" + axe.getDan());
    }
}
