//write a java program to explan the purpas of Substring method
class Sub {
    public static void main(String[] args) {
        String str = new String("Manik Patra");
        String str1 = "Manik";
        str = str.substring(6);
        String r = str1.substring(2);
        System.out.println("str = "+str);
        System.out.println("r = "+r);
    }
}
