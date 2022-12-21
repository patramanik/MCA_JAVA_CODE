public class Str2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String s1 = str1.concat(str2);
        System.out.println("s1 = " + s1);
        str1 = str1.concat(str2);
        System.out.println("send ="+str1);
    }
}
