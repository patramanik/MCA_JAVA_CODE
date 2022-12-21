
public class Abc {
    static String str = "abcd";
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = "cd";
        String str3 = "ab";
        String str4 = "ab" + "cd";
        String str5 = new String("abcd");
        String str6 = str3 + "cd";

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

        
    }
}
