public class Com {
    public static void main(String[] args) {
        String str1 = "Haldia";
        String str2 = "HALDIA";
        Boolean b1 = str1.equals(str2);
        Boolean b2 = str1.equalsIgnoreCase(str2);
        int b3 = str1.compareTo(str2);
        System.out.println("b1=" + b1);
        System.out.println("b2=" + b2);
        System.out.println("b3=" + b3);
    }
}
