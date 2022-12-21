//write a java program to explan the purpas of Trim method
class Trim {
    public static void main(String[] args) {
        String str = new String(" Manik Patra ");
        String str1 = " Manik ";
        str = str.trim();
        String r = str1.trim();
        System.out.println("str =" + str);
        System.out.println("str1 ="+r);
    }
}
