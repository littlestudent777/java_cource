public class Task1 {
    public static void main(String[] args) {
        Integer dec = Integer.decode("100");
        Integer hex = Integer.decode("0xFF");
        Integer neg = Integer.decode("-100");
        Integer oct = Integer.decode("0100");

        System.out.println(dec);
        System.out.println(hex);
        System.out.println(neg);
        System.out.println(oct);
    }
}
